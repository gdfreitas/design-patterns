package gof.estrutura.proxy;

/**
 * @author gabriel.freitas
 */
public class Banco {

    private int qtdUsuarios;

    Banco() {
        qtdUsuarios = (int) (Math.random() * 100);
    }

    public String getQtdUsuarios() {
        return "Total de usuários: " + qtdUsuarios;
    }

}
