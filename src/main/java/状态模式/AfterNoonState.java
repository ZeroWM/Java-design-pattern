package 状态模式;

public class AfterNoonState extends State{
  @Override
  public void writeCode(Work work) {
    if(work.getHour() < 17 ){
      System.out.println("下午好");
    }else {
      work.setState(new EveningState());
      work.writeCode();
    }

  }
}
