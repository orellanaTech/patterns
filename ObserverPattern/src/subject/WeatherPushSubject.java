package subject;

import observer.PullObserver;
import observer.PushObserver;

import java.util.ArrayList;

public class WeatherPushSubject implements PushSubject {
    
    private final ArrayList<PushObserver> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherPushSubject(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(PushObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PushObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(this.temperature, this.humidity, this.pressure));
    }
    

    public void measurementChanged(){
        this.notifyObservers();
    }

    public void setMeasurements( float temperature, float humidity, float pressure){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementChanged();
    }
}
