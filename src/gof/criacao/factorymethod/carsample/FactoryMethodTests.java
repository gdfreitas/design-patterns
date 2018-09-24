package gof.criacao.factorymethod.carsample;

/**
 * @author gabriel.freitas
 */
public class FactoryMethodTests {

    public static void main(String[] args) {

        CarFactory factory = new HondaCarFactory();
        Car car = factory.create();
        car.getDescription();

        factory = new JeepCarFactory();
        car = factory.create();
        car.getDescription();

        factory = new VolkswagenCarFactory();
        car = factory.create();
        car.getDescription();

    }

}
