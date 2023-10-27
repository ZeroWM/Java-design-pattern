package 桥接模式;

public class OracleDBConnection implements DBConnection {
  @Override
  public void connect() {
    System.out.println("use oracle db connection");
  }
}
