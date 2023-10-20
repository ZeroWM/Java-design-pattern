package 策略模式.strategy.Behavior.squeak;

public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("不会叫");
  }
}
