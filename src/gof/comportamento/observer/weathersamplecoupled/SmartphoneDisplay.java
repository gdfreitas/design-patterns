package gof.comportamento.observer.weathersamplecoupled;

public class SmartphoneDisplay implements ITemperatureObserver {

    private WeatherStation weatherStation;

    public SmartphoneDisplay(final WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.add(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("SmartphoneDisplay: weather has changed to %s degrees", this.weatherStation.getTemperature()));
    }

}
