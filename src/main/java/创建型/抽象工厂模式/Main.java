package 创建型.抽象工厂模式;

public class Main {

  public static void main(String[] args) {
    // 使用反射动态创建具体工厂实例
    ShapeFactory shapeFactory = createFactory("创建型.抽象工厂模式.CircleFactory");

    // 使用工厂创建形状对象
    Shape shape = shapeFactory.createShape();
    shape.draw();
  }

  // 使用反射根据工厂类名创建工厂实例
  public static ShapeFactory createFactory(String factoryClassName) {
    try {
      Class<?> factoryClass = Class.forName(factoryClassName);
      return (ShapeFactory) factoryClass.getDeclaredConstructor().newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
