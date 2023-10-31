package 责任链模式;

public class Request {
  private String type;
  private int number;

  public Request(String type, int number) {
    this.type = type;
    this.number = number;
  }

  public String getType() {
    return type;
  }

  public int getNumber() {
    return number;
  }
}
