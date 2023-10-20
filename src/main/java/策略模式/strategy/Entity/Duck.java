package 策略模式.strategy.Entity;

import 策略模式.strategy.Behavior.fly.FlyBehavior;
import 策略模式.strategy.Behavior.squeak.QuackBehavior;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  protected abstract void swim();

  protected abstract void display();

  public abstract void performDuck();

  public abstract void performFly();

  public abstract void setFlyBehavior(FlyBehavior flyBehavior);

  public abstract void setQuackBehavior(QuackBehavior quackBehavior);
}
