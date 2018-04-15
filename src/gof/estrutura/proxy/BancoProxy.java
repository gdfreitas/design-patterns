package gof.estrutura.proxy;

/**
 * @author gabriel.freitas
 */
public class BancoProxy extends Banco {

    private String usuario, senha;

    BancoProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public String getQtdUsuarios() {
        if (hasPermission()) {
            return super.getQtdUsuarios();
        }

        return null;
    }

    private boolean hasPermission() {
        return usuario.equals("admin") && senha.equals("admin");
    }

}
