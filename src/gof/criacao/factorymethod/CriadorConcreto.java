package gof.criacao.factorymethod;

/**
 * @author gabriel.freitas
 */
public class CriadorConcreto extends CriadorAbstrato {

    @Override
    public ProdutoAbstrato metodoFabricacao() {
        System.out.println("instânciando um novo produto concreto");
        return new ProdutoConcreto();
    }

}
