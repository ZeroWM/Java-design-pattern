package 访问者模式;

public abstract class Visitor {
  public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

  public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
