package gof.criacao.factorymethod;

/**
 * @author gabriel.freitas
 */
public class FactoryMethodTests {

    public static void main(String[] args) {
        CriadorAbstrato criador = new CriadorConcreto();
        ProdutoAbstrato produto = criador.metodoFabricacao();
        produto.executarAcaoQualquer();
    }

}
