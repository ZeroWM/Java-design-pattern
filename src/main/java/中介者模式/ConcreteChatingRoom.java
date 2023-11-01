package 中介者模式;

public class ConcreteChatingRoom extends ChatingRoom {
  private UserA userA;

  @Override
  public void send(String msg, User user) {
    if (user.equals(this.userA)) {
      this.userA.notifying(msg);
    }
  }
}
