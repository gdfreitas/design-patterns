package gof.estrutura.decorator;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class DecoratorTests {

    public static void main(String[] args) {

        // incia somente com cachaça
        Coquetel coquetel = new Vodka();
        System.out.println(coquetel.getNome() + " = " + coquetel.getPreco());

        // decora com energético
        coquetel = new Energetico(coquetel);
        System.out.println(coquetel.getNome() + " = " + coquetel.getPreco());

        // decora com cubos de gelo
        coquetel = new CuboDeGelo(coquetel, 3);
        System.out.println(coquetel.getNome() + " = " + coquetel.getPreco());

    }

}
