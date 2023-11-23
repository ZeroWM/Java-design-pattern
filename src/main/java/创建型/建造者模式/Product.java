package 创建型.建造者模式;

import java.util.ArrayList;
import java.util.List;

public class Product {
  private List<String> parts = new ArrayList<>();

  public void add(String part) {
    parts.add(part);
  }

  public void show() {
    System.out.println("产品构建");
    for (String part : parts) {
      System.out.println(part);
    }
  }
}
