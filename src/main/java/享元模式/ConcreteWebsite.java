package 享元模式;

public class ConcreteWebsite extends WebSite {
  @Override
  public void use(User user) {
    System.out.println("具体 WebSite" + "用户是:" + user.getUsername());
  }
}
