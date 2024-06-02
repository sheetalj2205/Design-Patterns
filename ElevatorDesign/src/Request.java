public class Request implements Comparable<Request> {

  private InternalRequest internalRequest;
  private ExternalRequest externalRequest;

  public Request(final InternalRequest internalRequest, final ExternalRequest externalRequest) {
    this.externalRequest = externalRequest;
    this.internalRequest = internalRequest;
  }

  public InternalRequest getInternalRequest() {
    return internalRequest;
  }

  public ExternalRequest getExternalRequest() {
    return externalRequest;
  }

  public void setExternalRequest(final ExternalRequest externalRequest) {
    this.externalRequest = externalRequest;
  }

  public void setInternalRequest(final InternalRequest internalRequest) {
    this.internalRequest = internalRequest;
  }

  @Override
  public int compareTo(final Request request) {
    if(this.getInternalRequest().getDestinationFloor() == request.getInternalRequest().getDestinationFloor()) {
      return 0;
    }
    else if(this.getInternalRequest().getDestinationFloor() > request.getInternalRequest().getDestinationFloor()) {
      return 1;
    } else{
      return -1;
    }
  }

}
