package devices;

import com.company.Human;

public abstract class Car extends Device {

    String model = "Multipla";
    String producent = "Fiat";
    private Double price;
    public int productionYear = -1;

    public Car(String producent, String model, Double price, int productionYear)
    {
        this.producent = producent;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
    }

    public Double getPrice()
    {
        return this.price;
    }

    public void sell(Human seller, Human buyer, Double price) {

        if(seller.hasCarInGarage(this))
        {
            try {
                throw new Exception("[Error] The seller haven't got this car in garage!");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            return;
        }

        if(!buyer.hasEmptySlotInGarage())
        {
            try {
                throw new Exception("[Error] The buyer haven't got free slot in garage!");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }

            return;
        }

        if(buyer.cash < price)
        {
            try {
                throw new Exception("[Error] Buyer haven't got enough money for buy the car.");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }

            return;
        }

        if(buyer.getFirstAvailableSlotInGarage() == -1)
        {
            try {
                throw new Exception("[Error] Buyer haven't got any free slot in the garage.");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }

            return;
        }

        buyer.cash -= price;
        seller.cash += price;

        buyer.setCar(this, buyer.getFirstAvailableSlotInGarage());
        seller.deleteCarFromGarage(this);

        System.out.println("[Success] Seller successfully sold a car!");

    }

    //Do zad. 6
    public String toString(){
        return model+" "+producent+" "+price;
    }

    public void turnOn() { this.turnedOn = true; };

    public abstract void refuel();
}