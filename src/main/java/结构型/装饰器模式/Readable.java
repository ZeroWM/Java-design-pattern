package 结构型.装饰器模式;

import java.io.IOException;

public interface Readable {
  public int read(java.nio.CharBuffer cb) throws IOException;
}
