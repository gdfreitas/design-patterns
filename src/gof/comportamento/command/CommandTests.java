package gof.comportamento.command;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class CommandTests {

    public static void main(String[] args) {

        Multiplicador multiplicador = new Multiplicador(10);
        Potenciador potenciador = new Potenciador(2);

        Command multiplicadorPorDez = new MultiplicadorCommand(multiplicador);
        int multiplicadoPorDez = multiplicadorPorDez.execute(10);
        System.out.println(multiplicadoPorDez);

        Command potenciadorDeDois = new PotenciadorCommand(potenciador);
        int potenciadoNaDois = potenciadorDeDois.execute(2);
        System.out.println(potenciadoNaDois);

    }

}
