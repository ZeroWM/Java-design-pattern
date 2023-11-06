package 行为型.中介者模式;

public class Main {
  public static void main(String[] args) {
    ConcreteChatingRoom mediator = new ConcreteChatingRoom();
    UserA colleague = new UserA(mediator);

    colleague.send("你好啊");
  }
}
