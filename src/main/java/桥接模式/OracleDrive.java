package 桥接模式;

public class OracleDrive extends Drive {
  @Override
  void touch(DBConnection connection) {
    connection.connect();
  }
}
