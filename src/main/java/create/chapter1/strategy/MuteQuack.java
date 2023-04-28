package create.chapter1.strategy;

public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("不会叫");
  }
}
