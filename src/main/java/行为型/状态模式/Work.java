package 行为型.状态模式;

public class Work {
  private State state;
  private double hour;

  public Work() {
    this.state = new MorningState();
  }

  public void setHour(double hour) {
    this.hour = hour;
  }

  public double getHour() {
    return this.hour;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void writeCode() {
    this.state.writeCode(this);
  }
}
