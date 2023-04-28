package create.chapter1.strategy;

public class FlyWithWings  implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("by wings");
  }
}
