package devices;

public abstract class Device {

    String producer;
    String model;
    Integer yearOfProduction;
    Double price;
    Boolean turnedOn;

    public abstract void turnOn();

    public String toString(){
        return model+" "+producer+" "+yearOfProduction;
    }
}