package gof.criacao.factorymethod.carsample;

import gof.criacao.factorymethod.carsample.cars.Compass;

/**
 * @author gabriel.freitas
 */
public class JeepCarFactory implements CarFactory {

    @Override
    public Car create() {
        return new Compass();
    }

}
