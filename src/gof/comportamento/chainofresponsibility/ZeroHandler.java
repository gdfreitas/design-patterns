package gof.comportamento.chainofresponsibility;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class ZeroHandler extends Handler {

    @Override
    public void handleRequest(final int number) {
        if (number == 0) {
            System.out.println("[ZeroHandler] O número " + number + " é zero\n");
        } else {
            // na lógica da cadeia implementada esta exceção nunca será lançada
            throw new IllegalArgumentException("[ZeroHandler] O último handler encadeado não soube o que fazer com o número");
        }
    }

}
