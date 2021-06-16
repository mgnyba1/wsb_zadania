package com.company;

import devices.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private static Double DEFAULT_SALARY_VALUE = 1000.00;
    private Double salary = DEFAULT_SALARY_VALUE;

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

    public Car getCar()
    {
        return this.car;
    }

    public boolean setCar(Car car)
    {
        if(this.salary > car.getPrice())
        {
            this.car = car;
            System.out.println("Successfully bought a car. The car is now assigned to the human.");
            return true;
        }
        else if(this.salary > car.getPrice()/12.0)
        {
            this.car = car;
            System.out.println("Successfully bought a car for credit. The car is now assigned to the human.");
            return true;
        }
        else
        {
            System.out.println("Error: You need more money to buy this car.");
            return false;
        }
    }

    public String toString(){
        return firstName+" "+lastName+" "+phone;
    }
}
