package 创建型.工厂方法模式;

public class SubFactory implements IFactory {

  @Override
  public Operation createOperation() {
    return new SubOperation();
  }
}
