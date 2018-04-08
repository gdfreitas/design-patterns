package gof.comportamento.command;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public interface Command {

    int execute(int number);

    void undo();

}
