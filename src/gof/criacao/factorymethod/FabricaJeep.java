package gof.criacao.factorymethod;

import gof.criacao.factorymethod.carros.Compass;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class FabricaJeep implements FabricaDeCarro {

    @Override
    public Carro fabricar() {
        return new Compass();
    }

}
