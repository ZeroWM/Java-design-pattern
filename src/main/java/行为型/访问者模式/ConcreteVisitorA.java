package 行为型.访问者模式;

public class ConcreteVisitorA extends Visitor {

  @Override
  public void visitConcreteElementA(ConcreteElementA concreteElementA) {
    System.out.println("visit a");
  }

  @Override
  public void visitConcreteElementB(ConcreteElementB concreteElementB) {
    System.out.println("visit b");
  }
}
