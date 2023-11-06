package 行为型.状态模式;

public class NoonState extends State {
  @Override
  public void writeCode(Work work) {
    if(work.getHour() < 13){
      System.out.println("qia 午饭");
    }else {
      work.setState(new AfterNoonState());
      work.writeCode();
    }
  }
}
