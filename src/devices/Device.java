package devices;

import com.company.Human;
import interfaces.*;

public abstract class Device implements Selleable {

    String producer;
    String model;
    Integer yearOfProduction;
    public Double price;
    Boolean turnedOn;

    public abstract void turnOn();

    public Double getPrice() { return price; };

    public String toString(){
        return model+" "+producer+" "+yearOfProduction;
    }
}