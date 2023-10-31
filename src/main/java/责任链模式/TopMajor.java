package 责任链模式;

public class TopMajor extends Manager {
  public TopMajor(String name) {
    super(name);
  }

  @Override
  public void requestApplications(Request request) {
    if (request.getType().equals("请假")) {
      System.out.println(name + request.getType() + request.getNumber());
    } else if (request.getType().equals("加薪") && request.getNumber() <= 50) {
      System.out.println(name + request.getType() + request.getNumber());
    } else if (request.getType().equals("加薪") && request.getNumber() > 50) {
      System.out.println("沙洋哪啦" + name + request.getType() + request.getNumber());
    }
  }
}
