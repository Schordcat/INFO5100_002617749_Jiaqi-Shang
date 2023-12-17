import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private float temperature;
    private List<WeatherStation> observers = new ArrayList<>();

    public void addObserver(WeatherStation observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherStation observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherStation observer : observers) {
            observer.update(temperature);
        }
    }
}
