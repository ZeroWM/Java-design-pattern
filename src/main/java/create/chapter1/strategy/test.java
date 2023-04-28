package create.chapter1.strategy;

public class test {
  public static void main(String[] args) {
    Duck duck = new DecoyDuck();
    duck.performFly();
    duck.performDuck();

    duck = new RedDuck();
    duck.performFly();
    duck.performDuck();

    duck = new GreenDuck();
    duck.performFly();
    duck.performDuck();

    duck = new RubberDuck();
    duck.performFly();
    duck.performDuck();
  }
}
