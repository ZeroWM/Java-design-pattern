package 装饰器;

import java.io.IOException;
import java.nio.CharBuffer;

public class BufferedReader extends Reader {
  private Reader in;

  public BufferedReader(Reader in) {
    this.in = in;
  }

  public int read(CharBuffer cb) throws IOException {
    return 0;
  }

  private void ensureOpen() throws IOException {
    if (in == null) throw new IOException("Stream closed");
  }

  public String readLine() throws IOException {
    synchronized (in) {
      ensureOpen();
      return "abc";
    }
  }
}
