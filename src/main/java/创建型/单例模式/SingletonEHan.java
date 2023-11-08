package 创建型.单例模式;

public class SingletonEHan {
  private static final SingletonEHan instance = new SingletonEHan();

  private SingletonEHan() {}

  public static SingletonEHan getInstance() {
    return instance;
  }
}
