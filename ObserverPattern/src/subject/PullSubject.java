package subject;

import observer.PullObserver;

public interface PullSubject {
    
    public float getTemperature();

    public float getHumidity();
    
    public float getPressure();
    
    public void addObserver(PullObserver observer);

    public void removeObserver(PullObserver observer);

    public void notifyObservers();

}
