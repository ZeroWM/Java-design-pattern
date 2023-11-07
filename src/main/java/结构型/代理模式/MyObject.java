package 结构型.代理模式;

public class MyObject implements MyInterface {
  @Override
  public void doSomething() {
    System.out.println("真实操作");
  }
}
