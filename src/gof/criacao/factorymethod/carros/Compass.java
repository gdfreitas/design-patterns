package gof.criacao.factorymethod.carros;

import gof.criacao.factorymethod.Carro;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Compass implements Carro {

    @Override
    public void imprimirInformacoes() {
        System.out.println("Modelo: Compass\nFabricante: Jeep\n");
    }

}