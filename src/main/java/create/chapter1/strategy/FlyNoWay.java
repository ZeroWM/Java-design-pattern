package create.chapter1.strategy;

public class FlyNoWay implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("can not fly");
  }
}
