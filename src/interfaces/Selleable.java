package interfaces;

import com.company.Human;

public interface Selleable {
    void sell(Human seller, Human buyer, Double price);
}
