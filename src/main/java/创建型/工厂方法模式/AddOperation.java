package 创建型.工厂方法模式;

public class AddOperation extends Operation {
  @Override
  public double getResult() {
    return getA() + getB();
  }
}
