package 中介者模式;

public abstract class User {
  protected ChatingRoom chatingRoom;

  public User(ChatingRoom chatingRoom) {
    this.chatingRoom = chatingRoom;
  }
}
