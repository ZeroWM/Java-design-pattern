package create.chapter1;

public class RedDuck extends  Duck{

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
    System.out.println("red duck");
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
