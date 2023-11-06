package 行为型.策略模式.strategy.Behavior.squeak;

public class Quack implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("呱呱");
  }
}
