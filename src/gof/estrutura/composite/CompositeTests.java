package gof.estrutura.composite;

/**
 * @author gabriel.freitas
 */
public class CompositeTests {

    public static void main(String[] args) {

        // criando primeiro nó
        Componente no1 = new Composite(4, null);

        // criando nó 2, filho de nó 1
        Componente no2 = new Composite(10, no1);

        // criando nó 3, filho de nó 1 também,
        Componente no3 = new Composite(2, no1);

        // relaciona os filhos de nó 1
        no1.addFilho(no2);
        no1.addFilho(no3);

        // criando nó 4, filho de nó 2
        Componente no4 = new Folha(7, no2);

        // criando nó 5, filho de nó 2 também
        Componente no5 = new Folha(5, no2);

        // relaciona os filhos de nó 2
        no2.addFilho(no4);
        no2.addFilho(no5);

        // criando nó 6, filho de nó 3, porém, é uma folha, nó final.
        Componente no6 = new Folha(1, no3);

        // relaciona o filho de nó 3
        no3.addFilho(no6);

        System.out.println("\nSOMA RELACIONADOS NÓ 1: " + no1.getTotalRelacionados());

        // tenta adicionar um filho à um nó que é folha e não composite
        try {
            System.out.println("Tentando adicionar filho à um nó que é folha");
            no6.addFilho(null);
        } catch (UnsupportedOperationException e) {
            System.out.println("Náo é permitido adicionar filhos à nós folhas: " + e.getMessage());
        }

        // criando nó 7, filho de nó 3 e também é uma folha final.
        Componente no7 = new Folha(9, no3);

        // relaciona o outro filho de nó 3
        no3.addFilho(no7);

        System.out.println("\nSOMA RELACIONADOS NÓ 1: " + no1.getTotalRelacionados());

        System.out.println("Lista dos filhos de nó 2: ");
        for (Componente componente : no2.getFilhos()) {
            System.out.println(">> " + componente.getValue());
        }

        System.out.println("Removendo o nó 5 que é filho do nó 2");
        no2.removeFilho(no5);

        System.out.println("Lista dos filhos de nó 2: ");
        for (Componente componente : no2.getFilhos()) {
            System.out.println(">> " + componente.getValue());
        }

        System.out.println("\nSOMA RELACIONADOS NÓ 1: " + no1.getTotalRelacionados());
    }

}
