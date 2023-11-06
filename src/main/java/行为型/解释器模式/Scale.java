package 行为型.解释器模式;

public class Scale extends Expression {
  @Override
  public void execute(String key, double value) {
    String scale = "";
    switch (Integer.valueOf(Double.valueOf(value).intValue())) {
      case 1 -> scale = "低音";
      case 2 -> scale = "中音";
      case 3 -> scale = "高音";
    }

    System.out.println(scale);
  }
}
