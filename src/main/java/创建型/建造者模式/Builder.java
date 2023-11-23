package 创建型.建造者模式;

public abstract class Builder {
  public abstract void buildPartA();

  public abstract void buildPartB();

  public abstract Product getResult();
}
