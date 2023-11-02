package 备忘录模式;

// Originator
public class Idea {
  private String state;

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public IdeaStateMemento saveStateToMemento() {
    return new IdeaStateMemento(state);
  }

  public void getStateFromMemento(IdeaStateMemento memento) {
    state = memento.getState();
  }
}
