import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private List<Observer> observerList;
  private float temp;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observerList = new ArrayList<Observer>();
  }


  @Override
  public void registerObserver(final Observer o) {
    observerList.add(o);
  }

  @Override
  public void removeObserver(final Observer o) {
    observerList.remove(o);

  }

  @Override
  public void notifyObserver() {
    for(Observer observer : observerList) {
      observer.update(temp, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObserver();
  }

  public void setMeasurements(final float temp, final float humidity, final float pressure) {
    this.temp = temp;
    this.pressure = pressure;
    this.humidity = humidity;
    measurementsChanged();
  }
}
