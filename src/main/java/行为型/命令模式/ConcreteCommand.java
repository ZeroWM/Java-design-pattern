package 行为型.命令模式;

public class ConcreteCommand extends Command {

  public ConcreteCommand(Receiver receiver) {
    super(receiver);
  }

  @Override
  public void execute() {
    receiver.action();
  }
}
