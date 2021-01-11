package subject;

import observer.PullObserver;

import java.util.ArrayList;

public class WeatherPullSubject implements PullSubject {


    private final ArrayList<PullObserver> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherPullSubject(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(PullObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PullObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        observers.forEach(PullObserver::update);

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    private void measurementChanged(){
        this.notifyObservers();
    }

    public void setMeasurements( float temperature, float humidity, float pressure){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementChanged();
    }
}
