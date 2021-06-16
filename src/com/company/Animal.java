package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    File pic;
    private Double weight;
    private Boolean isDead = false;

    static final Double DEFAULT_DOG_WEIGHT = 10.0;
    static final Double DEFAULT_LION_WEIGHT = 30.0;
    static final Double DEFAULT_CAT_WEIGHT = 5.0;

    public Animal(String species) {
        this.species = species;
        if (species == "Dog") {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "Lion") {
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = DEFAULT_CAT_WEIGHT;
        }

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
}