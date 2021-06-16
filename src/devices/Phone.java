package devices;

import com.company.Human;

import java.net.URL;
import java.util.ArrayList;

public class Phone extends Device {
    String producer;
    String model;
    Double screenSize;
    static final String defaultAppsServerAddress = "apps.wsb.pl";
    static final String defaultAppsServerProtocol = "https";
    static final String defaultAppsVersion = "1.0.0";

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

    public void installAnApp(String appName)
    {
        System.out.println("(Apps) App " + appName + " installed!");
    }

    public void installAnApp(String appName, String version)
    {
        System.out.println("(Apps) App " + appName + " installed!");
    }

    public void installAnApp(String appName, String version, String serverURL)
    {
        System.out.println("(Apps) App " + appName + " installed!");
    }

    public void installAnApp(ArrayList<String> appsNames)
    {
        for(String app : appsNames)
        {
            System.out.println("(Apps) App " + app + " installed!");
        }

    }

    //Przykładowy obiekt: URL home = new URL("http://apps.wsb.pl/?appName=test&version=1.0.1&server=wsb.pl");
    public void installAnApp(URL url)
    {
        System.out.println("(Apps) App from URL instlaled!");
    }

    public void turnOn() { this.turnedOn = true; };
}
