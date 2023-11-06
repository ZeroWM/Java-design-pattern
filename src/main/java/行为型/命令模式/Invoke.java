package 行为型.命令模式;

public class Invoke {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void execute() {
    command.execute();
  }
}
