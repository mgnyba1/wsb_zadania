package devices;

public class LPG extends Car {

    public LPG(String producent, String model, Double price) {
        super(producent, model, price);
    }

    @Override
    public void refuel() {
        System.out.println("[Success] LPG refuelled!");
    }
}
