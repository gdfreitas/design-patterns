package gof.criacao.abstractfactory.carros;

import gof.criacao.abstractfactory.CarroHatch;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Golf implements CarroHatch {

    @Override
    public void imprimirInformacoes() {
        System.out.println("Modelo: Golf\nCategoria: Hatch\n");
    }

}
