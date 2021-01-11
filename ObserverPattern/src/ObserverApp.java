import display.*;
import subject.WeatherPullSubject;
import subject.WeatherPushSubject;

public class ObserverApp {

    public static void main(String[] args) throws InterruptedException {

        WeatherPullSubject pullStation = new WeatherPullSubject();

        WeatherPushSubject pushStation = new WeatherPushSubject();

        HeatDisplay heatDisplay = new HeatDisplay(pullStation);
        HumidityDisplay humidityDisplay = new HumidityDisplay(pullStation);
        PressureDisplay pressureDisplay = new PressureDisplay(pullStation);

        AllStatisticsDisplay allStatisticsDisplay = new AllStatisticsDisplay();
        RainProbabilityDisplay rainProbabilityDisplay = new RainProbabilityDisplay();

        pushStation.addObserver(allStatisticsDisplay);
        pushStation.addObserver(rainProbabilityDisplay);

        pullStation.setMeasurements(1, 1, 1);
        pushStation.setMeasurements(2, 2, 2);
        Thread.sleep(1000);

        pullStation.setMeasurements(10, 10, 10);
        pushStation.setMeasurements(20, 20, 20);
        Thread.sleep(1000);

        pullStation.removeObserver(heatDisplay);
        pushStation.removeObserver(allStatisticsDisplay);
        pullStation.setMeasurements(10, 10, 10);
        pushStation.setMeasurements(20, 20, 20);

    }
}
