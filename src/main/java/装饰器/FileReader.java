package 装饰器;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileReader extends Reader {
  private InputStream in;

  public FileReader(String fileName) throws FileNotFoundException {
    this.in = new FileInputStream(fileName);
  }

}
