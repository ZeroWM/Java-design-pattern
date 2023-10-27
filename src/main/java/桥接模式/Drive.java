package 桥接模式;

public abstract class Drive {
  protected DBConnection connection;

  abstract void touch(DBConnection connection);
}