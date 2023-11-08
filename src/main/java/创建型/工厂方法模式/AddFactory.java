package 创建型.工厂方法模式;

public class AddFactory implements IFactory{
  @Override
  public Operation createOperation() {
    return new AddOperation();
  }
}
