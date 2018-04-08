package gof.comportamento.command;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Multiplicador {

    private int multiplicador;

    public Multiplicador(final int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int vezes(int number) {
        System.out.println("[Multiplicador] multiplicando " + number + " por " + multiplicador);
        return number * multiplicador;
    }

}
