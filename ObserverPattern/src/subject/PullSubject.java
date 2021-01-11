package subject;

import observer.PullObserver;

public interface PullSubject {

    public void addObserver(PullObserver observer);

    public void removeObserver(PullObserver observer);

    public void notifyObservers();

}
