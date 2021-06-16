package devices;

public class Electric extends Car {

    public Electric(String producent, String model, Double price, int productionYear) {
        super(producent, model, price, productionYear);
    }

    @Override
    public void refuel() {
        System.out.println("[ERROR] You cannot refuel electric car!");
    }
}
