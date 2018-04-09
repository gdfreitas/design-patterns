package gof.criacao.factorymethod;

import gof.criacao.factorymethod.carros.Golf;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class FabricaVolkswagen implements FabricaDeCarro {

    @Override
    public Carro fabricar() {
        return new Golf();
    }

}
