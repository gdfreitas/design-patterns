package gof.criacao.factorymethod.carsample;

import gof.criacao.factorymethod.carsample.cars.Civic;

/**
 * @author gabriel.freitas
 */
public class HondaCarFactory implements CarFactory {

    @Override
    public Car create() {
        return new Civic();
    }

}
