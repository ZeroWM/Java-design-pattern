package 创建型.原型模式;

public class Main {
  public static void main(String[] args) {
    ConcretePrototype1 p1 = new ConcretePrototype1("a");
    ConcretePrototype1 copy = (ConcretePrototype1) p1.clone();

    System.out.println(copy.getId());
  }
}
