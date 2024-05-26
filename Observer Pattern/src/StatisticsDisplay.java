public class StatisticsDisplay implements Observer, Display{
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum = 0;
  private int reading = 0;

  public StatisticsDisplay(final WeatherData weatherData) {
    weatherData.registerObserver(this);
  }


  @Override
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (tempSum / reading)
                       + "/" + maxTemp + "/" + minTemp);
  }

  @Override
  public void update(final float temp, final float humidity, final float pressure) {
    tempSum += temp;
    reading++;

    if (temp > maxTemp) {
      maxTemp = temp;
    }
    if (temp < minTemp) {
      minTemp = temp;
    }
    display();
  }

}
