public class WeatherStation {

  public static void main(String[] args) {
    /*
    Observer pattern defines a one-to-many dependency between objects so that when one object changes state
    , all of its dependents are modified and updated accordingly.
     */
    System.out.println("Design a Weather Station");
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

    weatherData.setMeasurements(80, 50, 60);
    weatherData.setMeasurements(100, 60, 50);

    weatherData.removeObserver(currentConditionsDisplay);
    weatherData.setMeasurements(130, 60, 150);
  }
}