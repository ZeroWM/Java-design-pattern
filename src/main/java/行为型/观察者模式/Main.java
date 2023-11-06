package 行为型.观察者模式;

public class Main {
  public static void main(String[] args) {
    ConcreteSubject s = new ConcreteSubject();
    s.attach(new ConcreteObserver(s, "a"));
    s.attach(new ConcreteObserver(s, "b"));
    s.setSubjectStatus("ab");

    s.notifying();
  }
}
