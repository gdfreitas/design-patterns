package gof.criacao.factorymethod.carsample.cars;

import gof.criacao.factorymethod.carsample.Car;

/**
 * @author gabriel.freitas
 */
public class Civic implements Car {

    @Override
    public void getDescription() {
        System.out.println("Model: Civic\nFactor: Honda\n");
    }

}
