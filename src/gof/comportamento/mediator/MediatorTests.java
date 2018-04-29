package gof.comportamento.mediator;

/**
 * @author gabriel.freitas
 */
public class MediatorTests {

    public static void main(String[] args) {
        MensagemMediator mediador = new MensagemMediator();

        AndroidColleague android = new AndroidColleague(mediador);
        IOSColleague ios = new IOSColleague(mediador);
        SymbianColleague symbian = new SymbianColleague(mediador);

        mediador.adicionarColleague(android);
        mediador.adicionarColleague(ios);
        mediador.adicionarColleague(symbian);

        symbian.enviarMensagem("Oi, eu sou um Symbian!");
        System.out.println("\n");
        android.enviarMensagem("Oi Symbian! Eu sou um Android!");
        System.out.println("\n");
        ios.enviarMensagem("Olá todos, sou um iOs!");
    }

}
