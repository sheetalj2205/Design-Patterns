public class ExternalRequest {
  private int sourceFloor;
  private Direction directionToMove;

  public ExternalRequest(final int sourceFloor, final Direction direction) {
    this.directionToMove = direction;
    this.sourceFloor = sourceFloor;
  }

  public int getSourceFloor() {
    return this.sourceFloor;
  }

  public void setSourceFloor(final int sourceFloor) {
    this.sourceFloor = sourceFloor;
  }

  public Direction getDirectionToMove() {
    return directionToMove;
  }

  public void setDirectionToMove(final Direction directionToMove) {
    this.directionToMove = directionToMove;
  }

  @Override
  public String toString() {
    return " The Elevator has been requested on floor - " + sourceFloor + " and the person wants go in the - "
           + directionToMove;
  }

}
