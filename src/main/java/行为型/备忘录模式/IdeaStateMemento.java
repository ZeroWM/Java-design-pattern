package 行为型.备忘录模式;

// Memento
public class IdeaStateMemento {
  private String state;

  public IdeaStateMemento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
