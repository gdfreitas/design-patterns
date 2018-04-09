package gof.criacao.abstractfactory.carros;

import gof.criacao.abstractfactory.CarroHatch;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Fit implements CarroHatch {

    @Override
    public void imprimirInformacoes() {
        System.out.println("Modelo: Fit\nCategoria: Hatch\n");
    }

}
