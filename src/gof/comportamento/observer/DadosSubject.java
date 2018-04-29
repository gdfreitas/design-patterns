package gof.comportamento.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gabriel.freitas
 */
public class DadosSubject {

    protected List<DadosObserver> observers;
    protected Dados dados;

    public DadosSubject() {
        observers = new ArrayList<>();
    }

    public void attach(DadosObserver observer) {
        observers.add(observer);
    }

    public void detach(int indice) {
        observers.remove(indice);
    }

    private void notifyObservers() {
        for (DadosObserver observer : observers) {
            observer.update();
        }
    }

    public Dados getState() {
        return dados;
    }

    public void setState(Dados dados) {
        this.dados = dados;
        notifyObservers();
    }

}
