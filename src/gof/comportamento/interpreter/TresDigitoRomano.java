package gof.comportamento.interpreter;

/**
 * @author gabriel.freitas
 */
public class TresDigitoRomano extends NumeroRomanoInterpreter {

    @Override
    public String um() {
        return "C";
    }

    @Override
    public String quatro() {
        return "CD";
    }

    @Override
    public String cinco() {
        return "D";
    }

    @Override
    public String nove() {
        return "CM";
    }

    @Override
    public int multiplicador() {
        return 100;
    }

}
