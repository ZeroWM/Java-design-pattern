package 创建型.抽象工厂模式;

public class CircleFactory implements ShapeFactory {
  @Override
  public Shape createShape() {
    return new Circle();
  }
}
