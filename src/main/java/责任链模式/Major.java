package 责任链模式;

public class Major extends Manager {
  public Major(String name) {
    super(name);
  }

  @Override
  public void requestApplications(Request request) {
    if (request.getType().equals("请假") && request.getNumber() <= 5) {
      System.out.println(name + request.getType() + request.getNumber());
    } else {
      if (superior != null) {
        superior.requestApplications(request);
      }
    }
  }
}
