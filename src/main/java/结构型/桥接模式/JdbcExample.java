package 结构型.桥接模式;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {
  public static void main(String[] args) {
    try {
      // 加载驱动程序
      Class.forName("com.mysql.jdbc.Driver");
      //      Class.forName("oracle.jdbc.driver.OracleDriver");

      // 获取数据库连接
      Connection conn =
          DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "username", "password");
      //      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
      // "username", "password");

      // 创建 Statement 对象
      Statement stmt = conn.createStatement();

      // 执行 SQL 查询
      ResultSet rs = stmt.executeQuery("SELECT * FROM users");

      // 处理查询结果
      while (rs.next()) {
        System.out.println("User ID = " + rs.getInt("id"));
        System.out.println("User name = " + rs.getString("name"));
      }

      // 关闭资源
      rs.close();
      stmt.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
