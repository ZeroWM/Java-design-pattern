package create.chapter1;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck(){
    setFlyBehavior();
    setQuackBehavior();
  }

  protected abstract void swim();

  protected abstract void display();

  protected abstract void performDuck();

  protected abstract void performFly();

  protected abstract void setFlyBehavior();

  protected abstract void setQuackBehavior();
}
