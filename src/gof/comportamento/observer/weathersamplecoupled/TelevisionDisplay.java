package gof.comportamento.observer.weathersamplecoupled;

public class TelevisionDisplay implements ITemperatureObserver {

    private WeatherStation weatherStation;

    public TelevisionDisplay(final WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.add(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("TelevisionDisplay: weather has changed to %s degrees", this.weatherStation.getTemperature()));
    }

}
