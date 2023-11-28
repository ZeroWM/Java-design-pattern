package 结构型.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SimpleJDKDynamicProxyDemo {
  interface IService {
    void sayHello();
  }

  static class RealService implements IService {

    @Override
    public void sayHello() {
      System.out.println("hello");
    }
  }

  static class SimpleInvocationHandler implements InvocationHandler {
    private Object realObject;

    public SimpleInvocationHandler(Object realObject) {
      this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      System.out.println(
          "entering " + realObject.getClass().getSimpleName() + "::" + method.getName());
      Object result = method.invoke(realObject, args);
      System.out.println("leaving " + method.getName());
      return result;
    }
  }

  public static void main(String[] args) {
    IService realService = new RealService();
    IService proxyService =
        (IService)
            Proxy.newProxyInstance(
                IService.class.getClassLoader(),
                new Class<?>[] {IService.class},
                new SimpleInvocationHandler(realService));
    proxyService.sayHello();
  }
}
