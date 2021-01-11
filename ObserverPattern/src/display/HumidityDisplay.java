package display;

import observer.PullObserver;
import subject.WeatherPullSubject;

public class HumidityDisplay implements PullObserver, DisplayElement {

    private WeatherPullSubject weatherPullSubject;

    public HumidityDisplay(WeatherPullSubject weatherPullSubject){
        this.weatherPullSubject = weatherPullSubject;
        this.weatherPullSubject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Humidity is: "  + this.weatherPullSubject.getHumidity());
    }

    @Override
    public void update() {
        this.display();
    }
}
