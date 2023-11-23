package 创建型.抽象工厂模式;

public class RectangleFactory implements ShapeFactory {
  @Override
  public Shape createShape() {
    return new Rectangle();
  }
}
