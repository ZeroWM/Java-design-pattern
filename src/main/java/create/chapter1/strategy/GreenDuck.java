package create.chapter1.strategy;

public class GreenDuck  extends  Duck{
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
    System.out.println("green duck");
  }

  @Override
  protected void performFly() {
    flyBehavior.fly();
  }

  @Override
  protected void setFlyBehavior() {
    this.flyBehavior = new FlyWithWings();
  }

  @Override
  protected void setQuackBehavior() {
    this.quackBehavior = new Quack();
  }
}
