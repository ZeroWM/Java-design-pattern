package 创建型.工厂方法模式;

public class SubOperation extends Operation {

  @Override
  public double getResult() {
    return getA() - getB();
  }
}
