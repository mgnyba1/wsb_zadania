package com.company;

import devices.*;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.name = "Reksio";

        System.out.println("Hi, I'm " + dog.name);

        dog.feed();

        Car beatifulCar = new Car("Fiat", "Panda", 6000.0);
        Car beatifulCar2 = new Car("Fiat", "Panda", 6000.0);

        Human me = new Human();
        me.firstName = "Jan";
        me.lastName = "Kowalski";
        me.pet = dog;
        me.setCar(beatifulCar);
        me.getSalary();
        me.setSalary(5000.00);

        me.pet.feed();
        System.out.println(me.pet.species);

        me.pet = new Animal("Lion");
        me.pet.name = "Słoń";

        me.pet.feed();

        System.out.println(me.pet.species);

        Animal cat = new Animal("cat");
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
    }
}
