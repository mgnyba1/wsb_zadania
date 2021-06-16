package devices;

public class Disel extends Car {

    public Disel(String producent, String model, Double price) {
        super(producent, model, price);
    }

    @Override
    public void refuel() {
        System.out.println("[Success] Disel car refueled!");
    }
}
