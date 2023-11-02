package 备忘录模式;

public class Main {
  public static void main(String[] args) {
    Idea idea = new Idea();
    User user = new User();

    // Save State #1
    idea.setState("State #1");
    user.add(idea.saveStateToMemento());
    System.out.println("Saved State: " + idea.getState());

    // Save State #2
    idea.setState("State #2");
    user.add(idea.saveStateToMemento());
    System.out.println("Saved State: " + idea.getState());

    // Restore to State #1
    idea.getStateFromMemento(user.get(0));
    System.out.println("After restored, Current State: " + idea.getState());
  }
}
