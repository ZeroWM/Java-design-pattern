package create.chapter1.strategy.Behavior.squeak;

public class Quack implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("呱呱");
  }
}
