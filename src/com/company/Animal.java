package com.company;

import devices.*;
import java.io.File;
import interfaces.*;

public class Animal implements Selleable {
    final String species;
    String name;
    File pic;
    private Double weight;
    private Boolean isDead = false;
    private Double price;

    static final Double DEFAULT_DOG_WEIGHT = 10.0;
    static final Double DEFAULT_LION_WEIGHT = 30.0;
    static final Double DEFAULT_CAT_WEIGHT = 5.0;

    public Animal(String species, Double price) {
        this.species = species;
        this.price = price;
        if (species == "Dog") {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "Lion") {
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = DEFAULT_CAT_WEIGHT;
        }
    }

    public Double getPrice() { return this.price; }

    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.pet != this)
        {
            System.out.println("[Error] The seller haven't got this animal!");
        }

        if(buyer.cash < price)
        {
            System.out.println("[Error] Buyer haven't got enough money for buy animal.");
            return;
        }

        buyer.cash -= price;
        seller.cash += price;

        buyer.setAnimal(seller.getAnimal());
        seller.setAnimal(null);

        System.out.println("[Success] Seller successfully sold an animal!");
    }

    void feed() {

        if (this.isDead == true) {
            System.out.println("You cannot feed a dead animal!");
            return;
        }

        weight += 0.1;
        System.out.println("Thx bro, my weight is now " + weight);
    }

    void takeForAWalk() {
        if (this.isDead == true) {
            System.out.println("You take dead animal for a walk!");
            return;
        }

        weight -= 0.1;

        if (weight <= 0) {
            this.die();
        }
    }

    void die() {
        System.out.println("The pet died!");
        this.isDead = true;
    }

    public String toString(){
        return species+" "+name+" "+weight;
    }
}