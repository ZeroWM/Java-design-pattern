package 外观模式;

public class Main {

  public static void main(String[] args) {
    // facade 对应到我们到项目里面，就是 application service
    Facade facade = new Facade();

    facade.doResource();

    facade.doUserAndResource();
  }
}
