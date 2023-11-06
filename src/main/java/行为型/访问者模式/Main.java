package 行为型.访问者模式;

public class Main {
  public static void main(String[] args){
    ObjectStructure o = new ObjectStructure();
    o.attach(new ConcreteElementA());
    o.attach(new ConcreteElementB());

    ConcreteVisitorA v1 = new ConcreteVisitorA();
    o.accept(v1);
  }
}
