package devices;

public class Disel extends Car {

    public Disel(String producent, String model, Double price, int productionYear) {
        super(producent, model, price, productionYear);
    }

    @Override
    public void refuel() {
        System.out.println("[Success] Disel car refueled!");
    }
}
