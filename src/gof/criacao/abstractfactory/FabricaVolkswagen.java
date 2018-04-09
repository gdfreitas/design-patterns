package gof.criacao.abstractfactory;

import gof.criacao.abstractfactory.carros.Golf;
import gof.criacao.abstractfactory.carros.Jetta;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class FabricaVolkswagen implements FabricaDeCarro {

    @Override
    public CarroSedan fabricarSedan() {
        return new Jetta();
    }

    @Override
    public CarroHatch fabricarHatch() {
        return new Golf();
    }
}
