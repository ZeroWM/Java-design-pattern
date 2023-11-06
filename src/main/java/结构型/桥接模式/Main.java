package 结构型.桥接模式;

public class Main {

  public static void main(String[] args) {
    Drive drive = new MySQLDrive();
    drive.touch(new MysqlDBConnection());

    drive = new OracleDrive();
    drive.touch(new OracleDBConnection());
  }
}
