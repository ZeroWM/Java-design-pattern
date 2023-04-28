package create.chapter1.strategy;

public class RubberDuck extends Duck{

  @Override
  protected void swim() {
    System.out.println("游泳");
  }

  @Override
  protected void display() {
    quackBehavior.quack();
  }

  @Override
  protected void performDuck() {
    System.out.println("rubber duck");
  }

  @Override
  protected void performFly() {
    flyBehavior.fly();
  }

  @Override
  protected void setFlyBehavior() {
    this.flyBehavior = new FlyNoWay();
  }

  @Override
  protected void setQuackBehavior() {
    this.quackBehavior = new Squeak();
  }
}
