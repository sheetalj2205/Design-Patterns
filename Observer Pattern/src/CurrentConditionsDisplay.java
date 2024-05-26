public class CurrentConditionsDisplay implements Observer, Display{
  private float temp;
  private float humidity;
  private WeatherData weatherData;

  public CurrentConditionsDisplay(final WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }


  @Override
  public void display() {
    System.out.println("Current Conditions: temperature " + temp + " and humidity: " + humidity);
  }

  @Override
  public void update(final float temp, final float humidity, final float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    display();
  }
}
