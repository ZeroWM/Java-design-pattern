package 创建型.建造者模式;

public class Director {

  public void Construct(Builder builder) {
    builder.buildPartA();
    builder.buildPartB();
  }
}
