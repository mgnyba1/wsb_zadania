package com.company;

import devices.*;
import creatures.*;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Pet("Dog", 500.0);
        dog.setName("Reksio");

        System.out.println("Hi, I'm " + dog.getName());

        dog.feed();

        Car beatifulCar = new LPG("Fiat", "Panda", 6000.0);
        Car beatifulCar2 = new LPG("Fiat", "Panda", 6000.0);

        beatifulCar.refuel();

        Car electricMultipla = new Electric("Fiat", "Multipla", 999999.0);
        electricMultipla.refuel();

        Human me = new Human();
        me.firstName = "Jan";
        me.lastName = "Kowalski";
        me.pet = dog;
        me.setCar(beatifulCar);
        me.getSalary();
        me.setSalary(5000.00);

        me.pet.feed();
        System.out.println(me.pet.getSpecies());

        me.pet = new FarmAnimal("Krowa", 4000.0);
        me.pet.setName("Marcin");

        me.pet.feed();

        System.out.println(me.pet.getSpecies());

        Pet cat = new Pet("cat", 1200.00);
        cat.feed();

        for(int i=0;i<100;i++)
        {
            cat.takeForAWalk();
        }

        if(beatifulCar.hashCode() == beatifulCar2.hashCode())
        {
            if(beatifulCar.equals(beatifulCar2))
            {
                System.out.println("The cars objects are the same!");
            }
            else
            {
                System.out.println("The cars objects aren't the same!");
            }
        }
        else
        {
            System.out.println("The cars objects aren't the same!");
        }

        System.out.println(beatifulCar);
        System.out.println(beatifulCar2);

        System.out.println(beatifulCar.toString());
        System.out.println(cat.toString());
        System.out.println(me.toString());

        //Zad. 9
        Phone Xiaomi = new Phone();
        Xiaomi.price = 2000.00;
        me.setPhone(Xiaomi);
        me.cash = 90000.00;

        Human buyer = new Human();
        buyer.cash = 90000.00;

        Xiaomi.sell(me, buyer, 1000.0);
    }
}
