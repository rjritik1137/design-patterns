package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private  float pressure;
    private final List<Observer> observers = new ArrayList<>();
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        // this is push mechanism, subject the pushing the same data to all the observer.
        observers.forEach(observer -> observer.update(getTemperature(), getHumidity(), getPressure()));
    }
}
