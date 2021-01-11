package subject;

import observer.PushObserver;

public interface PushSubject {

    public void addObserver(PushObserver observer);

    public void removeObserver(PushObserver observer);
    
    public void notifyObservers();
}
