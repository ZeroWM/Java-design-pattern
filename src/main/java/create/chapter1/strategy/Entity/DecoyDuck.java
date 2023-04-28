package create.chapter1.strategy.Entity;

import create.chapter1.strategy.Behavior.fly.FlyBehavior;
import create.chapter1.strategy.Behavior.fly.FlyNoWay;
import create.chapter1.strategy.Behavior.squeak.MuteQuack;
import create.chapter1.strategy.Behavior.squeak.QuackBehavior;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new MuteQuack();
  }

  @Override
  public void swim() {
    System.out.println("不会游泳");
  }

  @Override
  public void display() {
    quackBehavior.quack();
  }

  @Override
  public void performDuck() {
    System.out.println("decoy duck");
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
