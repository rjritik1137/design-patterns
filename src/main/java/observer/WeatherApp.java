package observer;

// We have a Weather Data object which tracks the weather data. Now different screens needs to be updated whenever the data changes
// The weather data knows(we don't care) how to get the different variables, and it's measurementChanged method is called (doesn't matter how) whenever the data changes.
public class WeatherApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay c = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(23.2f, 23.2f, 23.2f);
        weatherData.setMeasurements(23.2f, 23.2f, 23.1f);
    }
}
