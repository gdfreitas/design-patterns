package gof.estrutura.decorator;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
public class CaramelCondiment extends BeverageDecorator {

    public static final double CARAMEL_PRICE = 0.35;

    public CaramelCondiment(final Beverage beverage) {
        super(beverage);
        this.description = "Caramel Condiment";
        this.price = BigDecimal.valueOf(CARAMEL_PRICE);
    }

}