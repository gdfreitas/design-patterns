package gof.estrutura.decorator;

/**
 * @author gabriel.freitas
 */
public class DecoratorTests {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " = " + espresso.getPrice());

        Beverage expressoWithCaramel = new CaramelCondiment(espresso);
        System.out.println(expressoWithCaramel.getDescription() + " = " + expressoWithCaramel.getPrice());

        Beverage decaf = new Decaf();
        System.out.println(decaf.getDescription() + " = " + decaf.getPrice());

        Beverage decafWithSoyMilk = new SoyMilkCondiment(decaf);
        System.out.println(decafWithSoyMilk.getDescription() + " = " + decafWithSoyMilk.getPrice());

        Beverage decafWithSoyMilkAndCaramel = new CaramelCondiment(decafWithSoyMilk);
        System.out.println(decafWithSoyMilkAndCaramel.getDescription() + " = " + decafWithSoyMilkAndCaramel.getPrice());
    }

}