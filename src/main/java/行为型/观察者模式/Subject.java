package 行为型.观察者模式;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
  private List<行为型.观察者模式.Observer> observers = new ArrayList<>();

  // 添加
  public void attach(行为型.观察者模式.Observer observer) {
    observers.add(observer);
  }

  // 移除
  public void detach(行为型.观察者模式.Observer observer) {
    observers.remove(observer);
  }

  public void notifying() {
    for (行为型.观察者模式.Observer o : observers) {
      o.update();
    }
  }
}
