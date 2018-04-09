package gof.criacao.factorymethod;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class FactoryMethodTests {

    public static void main(String[] args) {

        // honda
        FabricaDeCarro fabrica = new FabricaHonda();
        Carro carro = fabrica.fabricar();
        carro.imprimirInformacoes();

        // jeep
        fabrica = new FabricaJeep();
        carro = fabrica.fabricar();
        carro.imprimirInformacoes();

        // volswagen
        fabrica = new FabricaVolkswagen();
        carro = fabrica.fabricar();
        carro.imprimirInformacoes();

    }

}
