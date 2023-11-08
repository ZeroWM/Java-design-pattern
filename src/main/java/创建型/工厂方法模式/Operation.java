package 创建型.工厂方法模式;

public abstract class Operation {
  private double a;
  private double b;

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public abstract double getResult();
}
