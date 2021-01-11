package display;

import observer.PushObserver;

public class AllStatisticsDisplay implements DisplayElement, PushObserver {
    
    private float temperature;
    
    private float humidity;
    
    private float pressure;
    
    public AllStatisticsDisplay(){
        this.temperature = 0;
        this.humidity = 0;
        this.pressure = 0;
    }
    
    @Override
    public void display() {
        System.out.println("Temperature: " + temperature + "; Humidity: " + humidity + "; Pressure: " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
