package create.chapter1.strategy.Behavior.fly;

public class FlyNoWay implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("can not fly");
  }
}
