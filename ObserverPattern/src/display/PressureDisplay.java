package display;

import observer.PullObserver;
import subject.PullSubject;

public class PressureDisplay implements PullObserver, DisplayElement {

    private PullSubject pullSubject;

    public PressureDisplay(PullSubject weatherPullSubject){
        this.pullSubject = weatherPullSubject;
        this.pullSubject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Pressure is: "  + this.pullSubject.getPressure());
    }

    @Override
    public void update() {
        this.display();
    }
}
