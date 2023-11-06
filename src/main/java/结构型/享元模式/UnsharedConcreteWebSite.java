package 结构型.享元模式;

public class UnsharedConcreteWebSite extends WebSite {
  @Override
  public void use(User user) {
    System.out.println("不共享的 WebSite" + "用户是：" + user.getUsername());
  }
}
