package 行为型.解释器模式;

public class Speed extends Expression {
  @Override
  public void execute(String key, double value) {
    String speed;
    if (value < 500) {
      speed = "快速";
    } else if (value >= 100) {
      speed = "慢速";
    } else {
      speed = "中速";
    }
    System.out.println(speed);
  }
}
