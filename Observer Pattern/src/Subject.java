public interface Subject {
  public void registerObserver(final Observer o);
  public void removeObserver(final Observer o);
  public void notifyObserver();

}
