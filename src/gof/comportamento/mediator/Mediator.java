package gof.comportamento.mediator;

/**
 * @author gabriel.freitas
 */
public  interface Mediator {

    void enviar(String mensagem, Colleague colleague);

}
