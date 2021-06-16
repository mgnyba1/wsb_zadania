package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");
        dog.name = "Reksio";

        System.out.println("Hi, I'm " + dog.name);

        dog.feed();

        Human me = new Human();
        me.firstName = "Jan";
        me.lastName = "Kowalski";
        me.pet = dog;
        me.car = new Car("Fiat", "Panda");

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
    }
}
