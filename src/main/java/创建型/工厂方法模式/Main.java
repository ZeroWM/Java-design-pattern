package 创建型.工厂方法模式;

public class Main {
  public static void main(String[] args) {
    IFactory factory = new AddFactory();
    Operation operation = factory.createOperation();

    operation.setA(1);
    operation.setB(2);
    System.out.println(operation.getResult());
    
  }
}
