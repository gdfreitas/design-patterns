package gof.estrutura.decorator;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
public class SoyMilkCondiment extends BeverageDecorator {

    public static final double SOY_MILK_PRICE = 0.50;

    public SoyMilkCondiment(final Beverage beverage) {
        super(beverage);
        this.description = "Soy Milk Condiment";
        this.price = BigDecimal.valueOf(SOY_MILK_PRICE);
    }

}