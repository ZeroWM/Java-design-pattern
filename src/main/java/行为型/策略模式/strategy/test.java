package 行为型.策略模式.strategy;

import 行为型.策略模式.strategy.Behavior.fly.FlyWithWings;
import 行为型.策略模式.strategy.Entity.DecoyDuck;
import 行为型.策略模式.strategy.Entity.Duck;
import 行为型.策略模式.strategy.Entity.GreenDuck;
import 行为型.策略模式.strategy.Entity.RedDuck;
import 行为型.策略模式.strategy.Entity.RubberDuck;

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
