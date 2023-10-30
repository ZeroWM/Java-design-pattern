package 装饰器模式;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    Reader reader = new FileReader("abc");
    BufferedReader bufferedReader = new BufferedReader(reader);
    bufferedReader.readLine();
  }
}
