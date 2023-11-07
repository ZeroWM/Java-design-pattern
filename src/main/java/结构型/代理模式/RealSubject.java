package 结构型.代理模式;

public class RealSubject extends Subject {

  @Override
  public void request() {
    System.out.println("真实的请求");
  }
}
