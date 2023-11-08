package 结构型.组合模式;

public class Leaf extends Component {
  public Leaf(String name) {
    super(name);
  }

  @Override
  public void add(Component component) {
    System.out.println("不能添加叶子");
  }

  @Override
  public void remove(Component component) {
    System.out.println("不能移除叶子");
  }

  @Override
  public void display(int depth) {
    System.out.println("——" + depth + name);
  }
}
