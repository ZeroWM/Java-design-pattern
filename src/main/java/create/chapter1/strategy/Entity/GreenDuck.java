package create.chapter1.strategy.Entity;

import create.chapter1.strategy.Behavior.fly.FlyBehavior;
import create.chapter1.strategy.Behavior.fly.FlyWithWings;
import create.chapter1.strategy.Behavior.squeak.Quack;
import create.chapter1.strategy.Behavior.squeak.QuackBehavior;

public class GreenDuck extends Duck {

  public GreenDuck() {
    this.flyBehavior = new FlyWithWings();
    this.quackBehavior = new Quack();
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
    System.out.println("green duck");
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
