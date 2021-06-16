package devices;

import com.company.Human;

public class Car extends Device {

    String model = "Multipla";
    String producent = "Fiat";
    private Double price;

    public Car(String producent, String model, Double price)
    {
        this.producent = producent;
        this.model = model;
        this.price = price;
    }

    public Double getPrice()
    {
        return this.price;
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() != this) {
            System.out.println("[Error] The seller haven't got this car!");
            return;
        }

        if(buyer.cash < seller.getCar().getPrice())
        {
            System.out.println("[Error] Buyer haven't got enough money for buy the car.");
            return;
        }

        buyer.cash -= price;
        seller.cash += price;

        buyer.setCar(seller.getCar());
        seller.setCar(null);

        System.out.println("[Success] Seller successfully sold a car!");

    }

    //Do zad. 6
    public String toString(){
        return model+" "+producent+" "+price;
    }

    public void turnOn() { this.turnedOn = true; };
}