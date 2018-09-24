package gof.criacao.factorymethod.carsample.cars;

import gof.criacao.factorymethod.carsample.Car;

/**
 * @author gabriel.freitas
 */
public class Golf implements Car {

    @Override
    public void getDescription() {
        System.out.println("Model: Golf\nFactor: Volkswagen\n");
    }

}
