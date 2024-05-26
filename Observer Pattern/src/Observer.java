public interface Observer {

  public void update(final float temp, final float humidity, final float pressure);

  //these are the stat values the observers get from the Subject when a weather measurement changes

}
