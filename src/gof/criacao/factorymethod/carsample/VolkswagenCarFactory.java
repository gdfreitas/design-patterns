package gof.criacao.factorymethod.carsample;

import gof.criacao.factorymethod.carsample.cars.Golf;

/**
 * @author gabriel.freitas
 */
public class VolkswagenCarFactory implements CarFactory {

    @Override
    public Car create() {
        return new Golf();
    }

}
