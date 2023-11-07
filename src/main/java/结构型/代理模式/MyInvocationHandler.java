package 结构型.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
  private Object target;

  public MyInvocationHandler(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("Before method call");
    Object result = method.invoke(target, args);
    System.out.println("After method call");
    return result;
  }

  public static void main(String[] args) {
    MyInterface originalObject = new MyObject();
    MyInvocationHandler handler = new MyInvocationHandler(originalObject);
    MyInterface proxyObject =
        (MyInterface)
            Proxy.newProxyInstance(
                Main.class.getClassLoader(), new Class[] {MyInterface.class}, handler);
    proxyObject.doSomething();
  }
}
