public class TestElevator {

  public static void main(String[] args) {
    Elevator elevator = new Elevator();
    ExternalRequest externalRequest = new ExternalRequest(2, Direction.UP);
    InternalRequest internalRequest = new InternalRequest(5);

    Request request = new Request(internalRequest, externalRequest);
    request.compareTo(request);
  }
}