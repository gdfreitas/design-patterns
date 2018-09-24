package gof.comportamento.observer.weathersampleuncoupled;

public class TelevisionDisplay implements ITemperatureObserver {

    @Override
    public void update(double temperature) {
        System.out.println(String.format("TelevisionDisplay: weather has changed to %s degrees", temperature));
    }

}
