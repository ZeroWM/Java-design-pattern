package 行为型.策略模式.strategy.Behavior.fly;

public class FlyWithWings  implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("by wings");
  }
}
