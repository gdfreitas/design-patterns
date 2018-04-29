package gof.comportamento.iterator;

/**
 * @author gabriel.freitas
 */
public class IteratorTests {

    public static void main(String[] args) {
        CanaisEsporte meusCanais = new CanaisEsporte();

        System.out.println("Iterando com for:");

        for (IteradorCanais it = meusCanais.criarIterator(); !it.isDone(); it.proximoCanal()) {
            System.out.println(it.getNomeCanal());
        }

        System.out.println("\nIterando manualmente:");
        IteradorCanais it = meusCanais.criarIterator();
        System.out.println(it.getNomeCanal());
        it.proximoCanal();
        System.out.println(it.getNomeCanal());
        it.proximoCanal();
        System.out.println(it.getNomeCanal());
        it.proximoCanal();
        System.out.println(it.getNomeCanal());
        it.proximoCanal();
        System.out.println(it.getNomeCanal());

        System.out.println("\nIterando fora dos limites:");
        it.proximoCanal();
        System.out.println(it.getNomeCanal());
        it.first();
        it.voltarCanal();
        System.out.println(it.getNomeCanal());
    }

}
