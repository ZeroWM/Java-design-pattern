package 策略模式.strategy.Behavior.squeak;

public class Squeak  implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("吱吱");
  }
}
