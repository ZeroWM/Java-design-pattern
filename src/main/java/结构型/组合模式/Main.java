package 结构型.组合模式;

public class Main {
  public static void main(String[] args) {
    Composite root = new Composite("root");
    root.add(new Leaf("Leaf A"));
    root.add(new Leaf("Leaf B"));

    Composite comp = new Composite("composite X");
    comp.add(new Leaf("Leaf XA"));
    comp.add(new Leaf("Leaf XB"));

    root.add(comp);

    root.display(1);
  }
}
