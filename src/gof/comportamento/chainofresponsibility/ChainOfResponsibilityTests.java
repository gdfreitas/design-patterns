package gof.comportamento.chainofresponsibility;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class ChainOfResponsibilityTests {

    public static void main(String[] args) {

        Handler first = new PositiveHandler();
        Handler second = new NegativeHandler();
        Handler third = new ZeroHandler();

        first.setSucessor(second);
        second.setSucessor(third);

        System.out.println("Testando encadeamento com entrada = -1");
        first.handleRequest(-1);

        System.out.println("Testando encadeamento com entrada = 0");
        first.handleRequest(0);

        System.out.println("Testando encadeamento com entrada = 1");
        first.handleRequest(1);

    }

}
