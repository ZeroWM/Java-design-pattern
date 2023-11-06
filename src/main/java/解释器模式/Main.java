package 解释器模式;

public class Main {
  public static void main(String[] args) {
    PlayContext playContext = new PlayContext();
    String content = "0,2,E,0.5,G";
    playContext.setText(content);

    Expression expression;
    String[] playContexts = content.split(",");
    for (String p : playContexts) {
      if (p.equals("E")) {
        expression = new Scale();
      } else if (p.equals("G")) {
        expression = new Note();
      } else {
        expression = new Speed();
      }
      expression.interpret(playContext);
    }
  }
}
