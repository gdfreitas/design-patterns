package gof.estrutura.decorator;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
public abstract class Beverage {

    String description;
    BigDecimal price;

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

}