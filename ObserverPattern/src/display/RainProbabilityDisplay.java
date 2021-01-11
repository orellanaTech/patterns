package display;

import observer.PushObserver;

public class RainProbabilityDisplay implements DisplayElement, PushObserver {

    private float temperature;

    private float humidity;

    private float pressure;

    public RainProbabilityDisplay(){}
    
    @Override
    public void display() {
        System.out.println("Rain Probablity: " + temperature*humidity*pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
