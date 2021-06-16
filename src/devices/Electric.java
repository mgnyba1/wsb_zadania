package devices;

public class Electric extends Car {

    public Electric(String producent, String model, Double price) {
        super(producent, model, price);
    }

    @Override
    public void refuel() {
        System.out.println("[ERROR] You cannot refuel electric car!");
    }
}
