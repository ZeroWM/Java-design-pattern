package 行为型.观察者模式;

public class ConcreteObserver extends Observer {
  private String name;
  private String observerState;
  private ConcreteSubject subject;

  public ConcreteObserver(ConcreteSubject concreteSubject, String name) {
    this.subject = concreteSubject;
    this.name = name;
  }

  @Override
  public void update() {
    observerState = subject.subjectStatus();
    System.out.println("name:" + this.name + " state:" + observerState);
  }

  public ConcreteSubject subject() {
    return subject;
  }
}
