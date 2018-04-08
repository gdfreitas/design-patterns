package gof.comportamento.command;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class MultiplicadorCommand implements Command {

    private Multiplicador multiplicador;

    public MultiplicadorCommand(final Multiplicador multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public int execute(int number) {
        return multiplicador.vezes(number);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Este método não é utilizado neste contexto");
    }

}
