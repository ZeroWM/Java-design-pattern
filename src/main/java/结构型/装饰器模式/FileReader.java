package 结构型.装饰器模式;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileReader extends Reader {
  private InputStream in;

  public FileReader(String fileName) throws FileNotFoundException {
    this.in = new FileInputStream(fileName);
  }

}
