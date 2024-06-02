public class InternalRequest {

  private int destinationFloor;

  public InternalRequest(final int destinationFloor) {
    this.destinationFloor = destinationFloor;
  }

  public int getDestinationFloor() {
    return destinationFloor;
  }

  public void setDestinationFloor(final int destinationFloor) {
    this.destinationFloor = destinationFloor;
  }

  @Override
  public String toString() {
    return "The destinationFloor is - " + destinationFloor;
  }

}
