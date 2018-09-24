package gof.comportamento.observer.weathersampleuncoupled;

public class ObserverTests {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        SmartphoneDisplay smartphoneDisplay = new SmartphoneDisplay();
        weatherStation.add(smartphoneDisplay);

        TelevisionDisplay televisionDisplay = new TelevisionDisplay();
        weatherStation.add(televisionDisplay);

        weatherStation.setTemperature(29.3);
        weatherStation.setTemperature(27.3);
        weatherStation.setTemperature(28.5);
    }

}