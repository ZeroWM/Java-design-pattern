package 创建型.原型模式;

public class ConcretePrototype1 extends Prototype {
  public ConcretePrototype1(String id) {
    super(id);
  }

  @Override
  public Prototype clone() {
    return new ConcretePrototype1(this.getId());
  }
}
