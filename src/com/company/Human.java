package com.company;

import creatures.Animal;
import devices.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Human {
    String firstName;
    String lastName;
    Phone phone = null;
    Animal pet = null;
    public Double cash;

    int defaultCarsCountInGarage = 2;
    Car[] garage = null;

    private static Double DEFAULT_SALARY_VALUE = 1000.00;
    private Double salary = DEFAULT_SALARY_VALUE;

    public Human() {
        this.garage = new Car[defaultCarsCountInGarage];

        for(int i=0;i<defaultCarsCountInGarage;i++)
        {
            this.garage[i] = Main.randomCars.get(new Random().nextInt(Main.randomCars.size()));
        }

    }

    public Human(int garageSize) {
        this.garage = new Car[garageSize];

        for(int i=0;i<defaultCarsCountInGarage;i++)
        {
            this.garage[i] = Main.randomCars.get(new Random().nextInt(Main.randomCars.size()));
        }

    }

    public Double getSalary()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Data pobrania wartości o wypłacie: " + dateFormat.format(date) + ", wartość wypłaty: " + this.salary);
        return this.salary;
    }

    public boolean setSalary(Double value)
    {
        if(value < 0)
        {
            System.out.println("Error: You cannot assign value that is smaller than 0.");
            return false;
        }

        System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
        System.out.println("Pojawiła się konieczność odebrania aneksu do umowy od pani Hani z kadr.");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu.");

        this.salary = value;

        return true;
    }

    public Car getCar(int parkingPlaceNumber)
    {
        return this.garage[parkingPlaceNumber];
    }

    public Phone getPhone() { return this.phone; };
    public Animal getAnimal() { return this.pet; };

    public boolean setCar(Car car, int parkingPlaceNumber)
    {
        if(this.salary > car.getPrice())
        {
            this.garage[parkingPlaceNumber] = car;
            System.out.println("Successfully bought a car. The car is now assigned to the human.");
            return true;
        }
        else if(this.salary > car.getPrice()/12.0)
        {
            this.garage[parkingPlaceNumber] = car;
            System.out.println("Successfully bought a car for credit. The car is now assigned to the human.");
            return true;
        }
        else
        {
            System.out.println("Error: You need more money to buy this car.");
            return false;
        }
    }

    public Double getValueOfCarsInGarage()
    {
        Double value = 0.0;

        for(Car car : garage)
        {
            value += car.getPrice();
        }

        return value;
    }

    public void sortGarageByCarProductionDate()
    {
        Arrays.sort(garage, new Comparator<Car>(){

        public int compare(Car o1, Car o2)
        {
            return String.valueOf(o1.productionYear).compareTo(String.valueOf(o2.productionYear));
        }
    });
    }

    public void setPhone(Phone phone) { this.phone = phone; }
    public void setAnimal(Animal animal) { this.pet = animal; }

    public boolean hasAnyAnimal() { return this.pet == null ? false : true; }
    public boolean hasAnyPhone() { return this.phone == null ? false : true; }

    public String toString(){
        return firstName+" "+lastName+" "+phone;
    }

    public Boolean hasCarInGarage(Car car)
    {
        return Arrays.asList(garage).contains(car);
    }

    public Boolean hasEmptySlotInGarage()
    {
        for(Car car : garage)
        {
            if(car == null)
                return true;
        }

        return false;
    }

    public void deleteCarFromGarage(Car car)
    {
        for(int i=0;i<garage.length;i++)
        {
            if(car.hashCode() == garage[i].hashCode())
                garage[i] = null;
        }
    }

    public int getFirstAvailableSlotInGarage()
    {
        for(int i=0;i<garage.length;i++)
        {
            if(garage[i] == null)
                return i;
        }

        return -1;
    }
}
