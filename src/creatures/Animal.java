package creatures;

import com.company.Human;
import devices.*;
import java.io.File;
import interfaces.*;

public abstract class Animal implements Selleable, Feedable {
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
        if(seller.getAnimal() != this)
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

    public void feed() {

        if (this.isDead == true) {
            System.out.println("You cannot feed a dead animal!");
            return;
        }

        weight += 0.1;
        System.out.println("Thx bro, my weight is now " + weight);
    }

    public void feed(Double foodWeight) {

        if(this.isDead == true)
        {
            System.out.println("You cannot feed a dead animal!");
            return;
        }

        weight += foodWeight;
        System.out.println("Thx bro, my weight is now " + weight);
    }

    public void takeForAWalk() {
        if (this.isDead == true) {
            System.out.println("You want to take dead animal for a walk!");
            return;
        }

        weight -= 0.1;

        if (weight <= 0) {
            this.die();
        }
    }

    public void die() {
        System.out.println("The pet died!");
        this.isDead = true;
    }

    public String toString(){
        return species+" "+name+" "+weight;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public String getSpecies()
    {
        return this.species;
    }
}