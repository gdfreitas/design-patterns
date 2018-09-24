package gof.estrutura.decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage {

    public static final double ESPRESSO_PRICE = 1.50;

    public Espresso() {
        this.description = "Espresso Coffe";
        this.price = BigDecimal.valueOf(ESPRESSO_PRICE);
    }

}