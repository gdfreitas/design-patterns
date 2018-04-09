package gof.criacao.factorymethod;

import gof.criacao.factorymethod.carros.Civic;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class FabricaHonda implements FabricaDeCarro {

    @Override
    public Carro fabricar() {
        return new Civic();
    }

}
