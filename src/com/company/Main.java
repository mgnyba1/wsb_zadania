package com.company;

import devices.*;
import creatures.*;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Car> randomCars = new ArrayList<Car>();

    public static void main(String[] args) {

        randomCars = generateRandomCars();

        Pet dog = new Pet("Dog", 500.0);
        dog.setName("Reksio");

        System.out.println("Hi, I'm " + dog.getName());

        dog.feed();

        Car beatifulCar = new LPG("Fiat", "Panda", 6000.0, 2010);
        Car beatifulCar2 = new LPG("Fiat", "Panda", 6000.0, 2010);

        beatifulCar.refuel();

        Car electricMultipla = new Electric("Fiat", "Multipla", 999999.0, 2500);
        electricMultipla.refuel();

        Human me = new Human();
        me.firstName = "Jan";
        me.lastName = "Kowalski";
        me.pet = dog;

        int freeSlot = me.getFirstAvailableSlotInGarage();

        if(freeSlot != -1)
            me.setCar(beatifulCar, freeSlot);

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

    private static ArrayList<Car> generateRandomCars()
    {
        ArrayList<Car> result = new ArrayList<Car>();
        result.add(new LPG("Fiat", "Panda", 5000.0, 2002));
        result.add(new LPG("Fiat", "500", 30000.0, 2004));
        result.add(new LPG("Fiat", "Cinquecento", 1000.0, 2005));
        result.add(new LPG("Fiat", "Seicento", 4000.0, 2006));
        result.add(new LPG("Fiat", "125p", 3000.0, 2001));
        result.add(new LPG("Fiat", "126p", 20000.0, 1992));
        result.add(new LPG("Fiat", "Tipo", 12000.0, 2010));

        result.add(new LPG("Fiat", "Panda", 5000.0, 1992));
        result.add(new LPG("Fiat", "500", 30000.0, 2020));
        result.add(new LPG("Fiat", "Cinquecento", 1000.0, 1982));
        result.add(new LPG("Fiat", "Seicento", 4000.0, 1990));
        result.add(new LPG("Fiat", "125p", 3000.0, 2000));
        result.add(new LPG("Fiat", "126p", 20000.0, 1992));
        result.add(new LPG("Fiat", "Tipo", 12000.0, 2020));

        result.add(new LPG("Audi", "80", 5000.0, 2000));
        result.add(new LPG("Audi", "100", 6000.0, 2001));
        result.add(new LPG("Audi", "A4 B8", 20000.0, 2010));
        result.add(new LPG("Audi", "A4 B7", 15000.0, 2007));
        result.add(new LPG("Audi", "TT", 20000.0, 2004));
        result.add(new LPG("Audi", "A5", 35000.0, 2010));
        result.add(new LPG("Audi", "A6 C6", 18000.0, 2005));
        result.add(new LPG("Audi", "A6 C7", 30000.0, 2015));


        return result;
    }
}
