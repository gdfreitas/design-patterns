package gof.criacao.singleton;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class SingletonTests {

    public static void main(String[] args) {
        FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();

        System.out.println(fabrica.criarHonda());
        System.out.println(fabrica.criarVolkswagen());
        System.out.println(fabrica.criarJeep());

        System.out.println(fabrica.criarHonda());
        System.out.println(fabrica.criarVolkswagen());
        System.out.println(fabrica.criarJeep());

        System.out.println(fabrica);
    }

}
