package 结构型.代理模式.静态代理;

public class SimpleStaticProxyDemo {
  interface IService {
    void sayHello();
  }

  static class RealService implements IService {
    @Override
    public void sayHello() {
      System.out.println("hello world");
    }
  }

  static class TraceProxy implements IService {
    private IService realService;

    public TraceProxy(IService realService) {
      this.realService = realService;
    }

    @Override
    public void sayHello() {
      System.out.println("entering sayHello");
      this.realService.sayHello();
      System.out.println("leaving sayHello");
    }
  }

  public static void main(String[] args) {
    IService realService = new RealService();
    IService proxyService = new TraceProxy(realService);
    proxyService.sayHello();
  }
}
