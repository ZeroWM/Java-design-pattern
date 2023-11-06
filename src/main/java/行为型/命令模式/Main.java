package 行为型.命令模式;

public class Main {
  public static void main(String[] args) {
    Receiver r = new Receiver();
    Command command = new ConcreteCommand(r);
    Invoke invoke = new Invoke();

    invoke.setCommand(command);
    invoke.execute();
  }
}
