package 结构型.适配器模式;

public class Adapter extends Target {
  private Adaptee adaptee = new Adaptee();

  public void request() {
    adaptee.specificRequest();
  }
}
