package 结构型.适配器模式;

public class Main {
  public static void main(String[] args) {
    Target target = new Adapter();
    target.request();
  }
}
