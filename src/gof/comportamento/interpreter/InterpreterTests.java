package gof.comportamento.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gabriel.freitas
 */
public class InterpreterTests {

    public static void main(String[] args) {
        List<NumeroRomanoInterpreter> interpretadores = new ArrayList<>();
        interpretadores.add(new QuatroDigitoRomano());
        interpretadores.add(new TresDigitoRomano());
        interpretadores.add(new DoisDigitoRomano());
        interpretadores.add(new UmDigitoRomano());

        String numeroRomano = "CXCIV";

        Contexto contexto = new Contexto(numeroRomano);
        for (NumeroRomanoInterpreter numeroRomanoInterpreter : interpretadores) {
            numeroRomanoInterpreter.interpretar(contexto);
        }

        System.out.println(numeroRomano + " = " + Integer.toString(contexto.getOutput()));
    }

}
