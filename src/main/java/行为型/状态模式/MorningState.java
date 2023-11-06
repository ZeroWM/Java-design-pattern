package 行为型.状态模式;

public class MorningState extends State {
  @Override
  public void writeCode(Work work) {
    if(work.getHour() < 12){
      System.out.println("早上好");
    }else {
      work.setState(new NoonState());
      work.writeCode();
    }
  }
}
