package gof.comportamento.interpreter;

/**
 * @author gabriel.freitas
 */
public class DoisDigitoRomano extends NumeroRomanoInterpreter {

    @Override
    public String um() {
        return "X";
    }

    @Override
    public String quatro() {
        return "XL";
    }

    @Override
    public String cinco() {
        return "L";
    }

    @Override
    public String nove() {
        return "XC";
    }

    @Override
    public int multiplicador() {
        return 10;
    }

}
