package gof.comportamento.chainofresponsibility;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class NegativeHandler extends Handler {

    @Override
    public void handleRequest(final int number) {
        if (number < 0) {
            System.out.println("[NegativeHandler] O número " + number + " é negativo\n");
        } else {
            System.out.println("[NegativeHandler] Não sei o que fazer com este valor. Acionando o próximo...");
            this.sucessor.handleRequest(number);
        }
    }

}
