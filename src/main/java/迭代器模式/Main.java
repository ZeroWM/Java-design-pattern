package 迭代器模式;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    // 创建一个 ArrayList
    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");

    // 获取迭代器
    Iterator<String> iterator = list.iterator();

    // 使用迭代器遍历列表
    while (iterator.hasNext()) {
      String fruit = iterator.next();
      System.out.println(fruit);
    }
  }
}
