package 中介者模式;

public class UserA extends User {
  public UserA(ChatingRoom chatingRoom) {
    super(chatingRoom);
  }

  public void send(String msg) {
    chatingRoom.send(msg, this);
  }

  public void notifying(String msg) {
    System.out.println(msg);
  }
}
