package 责任链模式;

public class Main {
  public static void main(String[] args) {
    TopMajor topMajor = new TopMajor("A");
    Major major = new Major("B");
    CommonManager commonManager = new CommonManager("C");
    major.setSuperior(topMajor);
    commonManager.setSuperior(major);

    commonManager.requestApplications(new Request("请假", 1));

    commonManager.requestApplications(new Request("加薪", 50));

    commonManager.requestApplications(new Request("加薪", 100));
  }
}
