package gof.estrutura.decorator;

import java.math.BigDecimal;

/**
 * @author gabriel.freitas
 */
public class BeverageDecorator extends Beverage {

    Beverage beverage;

    public BeverageDecorator(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + this.description;
    }

    @Override
    public BigDecimal getPrice() {
        return beverage.getPrice().add(this.price);
    }

}