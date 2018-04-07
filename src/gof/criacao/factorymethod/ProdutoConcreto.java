package gof.criacao.factorymethod;

/**
 * @author gabriel.freitas
 */
public class ProdutoConcreto implements ProdutoAbstrato {

    public ProdutoConcreto() {
        System.out.println("ProdutoConcreto instanciado");
    }

    @Override
    public void executarAcaoQualquer() {
        System.out.println("executarAcaoQualquer()");
    }

}
