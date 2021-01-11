package display;

import observer.PullObserver;
import subject.PullSubject;

public class HeatDisplay implements PullObserver, DisplayElement {

    private PullSubject pullSubject;

    public HeatDisplay(PullSubject weatherPullSubject){
        this.pullSubject = weatherPullSubject;
        this.pullSubject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat is: "  + this.pullSubject.getTemperature());
    }

    @Override
    public void update() {
        this.display();
    }
}
