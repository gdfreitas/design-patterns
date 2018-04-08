package gof.comportamento.command;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Potenciador {

    private int potencia;

    public Potenciador(final int potencia) {
        this.potencia = potencia;
    }

    public int elevar(int number) {
        System.out.println("[Potenciador] elevando " + number + " para a potência de " + potencia);
        return (int) Math.pow(number, potencia);
    }

}
