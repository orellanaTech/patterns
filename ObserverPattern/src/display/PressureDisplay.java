package display;

import observer.PullObserver;
import subject.WeatherPullSubject;

public class PressureDisplay implements PullObserver, DisplayElement {

    private WeatherPullSubject weatherPullSubject;

    public PressureDisplay(WeatherPullSubject weatherPullSubject){
        this.weatherPullSubject = weatherPullSubject;
        this.weatherPullSubject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Pressure is: "  + this.weatherPullSubject.getPressure());
    }

    @Override
    public void update() {
        this.display();
    }
}
