package 桥接模式;

public class MySQLDrive extends Drive{
  @Override
  void touch(DBConnection connection) {
    connection.connect();
  }
}
