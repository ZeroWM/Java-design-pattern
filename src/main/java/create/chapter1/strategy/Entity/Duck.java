package create.chapter1.strategy.Entity;

import create.chapter1.strategy.Behavior.fly.FlyBehavior;
import create.chapter1.strategy.Behavior.squeak.QuackBehavior;

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
