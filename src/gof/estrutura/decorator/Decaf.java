package gof.estrutura.decorator;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
public class Decaf extends Beverage {

    public static final double DECAF_PRICE = 1.25;

    public Decaf() {
        this.description = "Decaf Coffe";
        this.price = BigDecimal.valueOf(DECAF_PRICE);
    }

}