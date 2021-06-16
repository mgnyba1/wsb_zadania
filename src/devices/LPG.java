package devices;

public class LPG extends Car {

    public LPG(String producent, String model, Double price, int productionYear) {
        super(producent, model, price, productionYear);
    }

    @Override
    public void refuel() {
        System.out.println("[Success] LPG refuelled!");
    }
}
