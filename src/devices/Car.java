package devices;

public class Car {

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
}