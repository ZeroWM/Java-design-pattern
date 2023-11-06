package 行为型.状态模式;

public class EveningState extends State {
  @Override
  public void writeCode(Work work) {
    System.out.println("晚安");
  }
}
