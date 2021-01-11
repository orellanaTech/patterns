package display;

import observer.PullObserver;
import subject.PullSubject;

public class HumidityDisplay implements PullObserver, DisplayElement {

    private PullSubject pullSubject;

    public HumidityDisplay(PullSubject weatherPullSubject){
        this.pullSubject = weatherPullSubject;
        this.pullSubject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Humidity is: "  + this.pullSubject.getHumidity());
    }

    @Override
    public void update() {
        this.display();
    }
}
