package 装饰器;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 在这个例子中，BufferedReader 是一个装饰器，它接收一个 Reader 对象（如 FileReader），
 * 并提供了缓冲读取的功能。当我们调用 bufferedReader.readLine() 时，实际上是调用了 FileReader 的 read() 方法，
 * 但是由于添加了缓冲，所以读取操作的效率更高。
 *
 * 这就是装饰器模式的威力：我们可以动态地、透明地给对象添加功能，而不需要修改原有的代码。
 */
public class DecoratorExample {
  public static void main(String[] args) {
    try {
      // 创建一个 FileReader 对象
      FileReader fileReader = new FileReader("test.txt");

      // 使用 BufferedReader 对象装饰 FileReader 对象
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      // 现在我们可以使用 BufferedReader 对象进行高效的读取操作
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      // 关闭资源
      bufferedReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
