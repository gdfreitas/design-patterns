package gof.comportamento.observer.weathersamplecoupled;

public class ObserverTests {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        SmartphoneDisplay smartphoneDisplay = new SmartphoneDisplay(weatherStation);
        TelevisionDisplay televisionDisplay = new TelevisionDisplay(weatherStation);

        weatherStation.setTemperature(29.3);
        weatherStation.setTemperature(27.3);
        weatherStation.setTemperature(28.5);
    }

}