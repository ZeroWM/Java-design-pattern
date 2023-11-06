package 行为型.访问者模式;

public class ConcreteElementA extends Element{

  @Override
  public void accept(Visitor visitor) {
    visitor.visitConcreteElementA(this);
  }
}
