package creatures;

import interfaces.Edbile;
import jdk.jshell.spi.ExecutionControl;

public class FarmAnimal extends Animal implements Edbile  {

    public FarmAnimal(String species, Double price)
    {
        super(species, price);
    }

    @Override
    public void beEaten() {
        System.out.println("Farm animal eaten!");
    }
}