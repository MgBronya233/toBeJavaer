import observer.CurrentConditionsDisplay;
import subject.WeatherData;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 32.4f);

        Exception
    }

}
