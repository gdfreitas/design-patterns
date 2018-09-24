package gof.comportamento.observer.weathersamplecoupled;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ITemperatureObservable {

    private List<ITemperatureObserver> observers = new ArrayList<>(0);
    private double temperature;

    @Override
    public void add(final ITemperatureObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(final ITemperatureObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(ITemperatureObserver::update);
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(final double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
