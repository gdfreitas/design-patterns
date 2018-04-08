package gof.comportamento.chainofresponsibility;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class PositiveHandler extends Handler {

    @Override
    public void handleRequest(final int number) {
        if (number > 0) {
            System.out.println("[PositiveHandler] O número " + number + " é positivo\n");
        } else {
            System.out.println("[PositiveHandler] Não sei o que fazer com este valor. Acionando o próximo...");
            this.sucessor.handleRequest(number);
        }
    }

}
