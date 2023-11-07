package 结构型.代理模式;

public class Proxy extends Subject {
  RealSubject realSubject;

  @Override
  public void request() {
    if (realSubject == null) {
      realSubject = new RealSubject();
    }
    realSubject.request();
  }
}
