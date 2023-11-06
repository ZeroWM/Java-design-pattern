package 行为型.解释器模式;

public abstract class Expression {
  public void interpret(PlayContext playContext) {
    if (playContext.getText().length() == 0) {
      return;
    } else {
      execute(playContext.getText(), 1);
    }
  }

  public abstract void execute(String key, double value);
}
