package gof.criacao.abstractfactory;

import gof.criacao.abstractfactory.carros.Civic;
import gof.criacao.abstractfactory.carros.Fit;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class FabricaHonda implements FabricaDeCarro {

    @Override
    public CarroSedan fabricarSedan() {
        return new Civic();
    }

    @Override
    public CarroHatch fabricarHatch() {
        return new Fit();
    }

}
