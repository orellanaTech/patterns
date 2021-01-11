package display;

import observer.PullObserver;
import subject.WeatherPullSubject;

public class HeatDisplay implements PullObserver, DisplayElement {

    private WeatherPullSubject weatherPullSubject;

    public HeatDisplay(WeatherPullSubject weatherPullSubject){
        this.weatherPullSubject = weatherPullSubject;
        this.weatherPullSubject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat is: "  + this.weatherPullSubject.getTemperature());
    }

    @Override
    public void update() {
        this.display();
    }
}
