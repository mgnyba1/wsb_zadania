package devices;

import com.company.Human;

public class Phone extends Device {
    String producer;
    String model;
    Double screenSize;

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getPhone() != this)
        {
            System.out.println("[Error] The seller haven't got this phone.");
            return;
        }

        if(buyer.cash < seller.getPhone().getPrice())
        {
            System.out.println("[Error] Buyer haven't got enough money for buy the phone.");
            return;
        }

        buyer.cash -= price;
        seller.cash += price;

        buyer.setPhone(seller.getPhone());
        seller.setPhone(null);

        System.out.println("[Success] Seller successfully sold a phone!");
    }

    public void turnOn() { this.turnedOn = true; };
}
