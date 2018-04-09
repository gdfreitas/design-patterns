package gof.criacao.factorymethod.carros;

import gof.criacao.factorymethod.Carro;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Golf implements Carro {

    @Override
    public void imprimirInformacoes() {
        System.out.println("Modelo: Golf\nFabricante: Volkswagen\n");
    }

}
