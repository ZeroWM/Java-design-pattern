package 策略模式.strategy.Entity;

import 策略模式.strategy.Behavior.fly.FlyBehavior;
import 策略模式.strategy.Behavior.fly.FlyNoWay;
import 策略模式.strategy.Behavior.squeak.QuackBehavior;
import 策略模式.strategy.Behavior.squeak.Squeak;

public class RubberDuck extends Duck {
  public RubberDuck() {
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new Squeak();
  }

  @Override
  public void swim() {
    System.out.println("游泳");
  }

  @Override
  public void display() {
    quackBehavior.quack();
  }

  @Override
  public void performDuck() {
    System.out.println("rubber duck");
  }

  @Override
  public void performFly() {
    flyBehavior.fly();
  }

  @Override
  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  @Override
  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
