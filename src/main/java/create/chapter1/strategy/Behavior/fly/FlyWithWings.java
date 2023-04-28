package create.chapter1.strategy.Behavior.fly;

public class FlyWithWings  implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("by wings");
  }
}
