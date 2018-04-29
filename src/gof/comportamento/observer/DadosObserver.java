package gof.comportamento.observer;

/**
 * @author gabriel.freitas
 */
public abstract class DadosObserver {

    protected DadosSubject dados;

    public DadosObserver(DadosSubject dados) {
        this.dados = dados;
    }

    public abstract void update();
}
