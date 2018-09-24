package gof.comportamento.observer.weathersamplecoupled;

public interface ITemperatureObservable {

    void add(ITemperatureObserver observe); // also called "register"/"attach"
    void remove(ITemperatureObserver observe); // also called "unregister"/"detach"
    void notifyObservers();

}