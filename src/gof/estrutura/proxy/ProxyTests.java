package gof.estrutura.proxy;

/**
 * @author gabriel.freitas
 */
public class ProxyTests {

    public static void main(String[] args) {
        System.out.println("Usuário sem permissão acessando: ");
        Banco banco = new BancoProxy("juvenal.silva", "1234");
        System.out.println(banco.getQtdUsuarios());

        System.out.println("\nAdministrador acessando: ");
        banco = new BancoProxy("admin", "admin");
        System.out.println(banco.getQtdUsuarios());
    }

}
