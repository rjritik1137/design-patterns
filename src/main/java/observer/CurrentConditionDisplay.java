package observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temperature, humidity, pressure;
    Subject s;
    CurrentConditionDisplay(Subject s) {
        this.s = s;
        s.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("temperature = " + temperature + " humidity = " + humidity + " Pressure = " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
