package 备忘录模式;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class User {
  private List<IdeaStateMemento> mementoList = new ArrayList<IdeaStateMemento>();

  public void add(IdeaStateMemento state) {
    mementoList.add(state);
  }

  public IdeaStateMemento get(int index) {
    return mementoList.get(index);
  }
}
