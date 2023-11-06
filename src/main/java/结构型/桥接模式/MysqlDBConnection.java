package 结构型.桥接模式;

public class MysqlDBConnection implements DBConnection {

  @Override
  public void connect() {
    System.out.println("use mysql db connection");
  }
}
