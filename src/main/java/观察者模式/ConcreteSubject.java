package 观察者模式;

public class ConcreteSubject extends Subject {
  private String subjectStatus;

  public String subjectStatus() {
    return subjectStatus;
  }

  public void setSubjectStatus(String subjectStatus){
    this.subjectStatus = subjectStatus;
  }
}
