package 装饰器;

import java.io.IOException;
import java.nio.CharBuffer;

public abstract class Reader implements Readable {
  @Override
  public int read(CharBuffer cb) throws IOException {
    return 0;
  }
}
