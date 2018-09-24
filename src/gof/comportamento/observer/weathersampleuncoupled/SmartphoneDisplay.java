package gof.comportamento.observer.weathersampleuncoupled;

public class SmartphoneDisplay implements ITemperatureObserver {

    @Override
    public void update(double temperature) {
        System.out.println(String.format("SmartphoneDisplay: weather has changed to %s degrees", temperature));
    }

}
