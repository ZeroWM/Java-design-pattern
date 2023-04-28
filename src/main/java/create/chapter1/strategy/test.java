package create.chapter1.strategy;

import create.chapter1.strategy.Behavior.fly.FlyWithWings;
import create.chapter1.strategy.Entity.DecoyDuck;
import create.chapter1.strategy.Entity.Duck;
import create.chapter1.strategy.Entity.GreenDuck;
import create.chapter1.strategy.Entity.RedDuck;
import create.chapter1.strategy.Entity.RubberDuck;

public class test {
  public static void main(String[] args) {
    Duck duck = new DecoyDuck();
    duck.performDuck();
    duck.performFly();

    System.out.println();

    duck = new RedDuck();
    duck.performDuck();
    duck.performFly();

    System.out.println();

    duck = new GreenDuck();
    duck.performDuck();
    duck.performFly();

    System.out.println();

    duck = new RubberDuck();
    duck.performDuck();
    duck.performFly();

    System.out.println();

    duck = new RubberDuck();
    duck.setFlyBehavior(new FlyWithWings());
    duck.performDuck();
    duck.performFly();
  }
}
