package gof.comportamento.command;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class PotenciadorCommand implements Command {

    private Potenciador potenciador;

    public PotenciadorCommand(final Potenciador potenciador) {
        this.potenciador = potenciador;
    }

    @Override
    public int execute(int number) {
        return potenciador.elevar(number);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Este método não é utilizado neste contexto");
    }

}
