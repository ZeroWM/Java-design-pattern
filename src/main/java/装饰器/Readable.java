package 装饰器;

import java.io.IOException;

public interface Readable {
  public int read(java.nio.CharBuffer cb) throws IOException;
}
