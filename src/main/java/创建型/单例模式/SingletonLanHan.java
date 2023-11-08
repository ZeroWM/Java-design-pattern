package 创建型.单例模式;

public class SingletonLanHan {
  private static SingletonLanHan instance;

  private SingletonLanHan() {}

  public static synchronized SingletonLanHan getInstance() {
    return instance == null ? new SingletonLanHan() : instance;
  }
}
