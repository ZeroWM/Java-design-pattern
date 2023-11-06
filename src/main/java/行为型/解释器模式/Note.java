package 行为型.解释器模式;

public class Note extends Expression {

  @Override
  public void execute(String key, double value) {
    String note = "";
    switch (key) {
      case "C" -> note = "1";
      case "D" -> note = "2";
      case "E" -> note = "3";
      case "F" -> note = "4";
      case "G" -> note = "5";
      case "A" -> note = "6";
      case "B" -> note = "7";
    }

    System.out.println(note);
  }
}
