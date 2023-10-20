package 享元模式;

public class Main {
  public static void main(String[] args) {
    /** 通过 factory 解决共享对象，通过子类解决不需要共享对象的问题
     * 实现的效果就是不管创建几个网站，只要是产品展示都是一样的，只要是博客也都是一样的
     * 享元模式共享了对象，减少了对象大批量创建的开支
     * * */
    WebSiteFactory flyWeightFactory = new WebSiteFactory();
    User user = new User("Jack");
    flyWeightFactory.getWebSite("产品展示").use(user);

    user = new User("Lily");
    flyWeightFactory.getWebSite("博客").use(user);

    UnsharedConcreteWebSite unsharedConcreteFlyweight = new UnsharedConcreteWebSite();
    user = new User("abc");
    unsharedConcreteFlyweight.use(user);
  }
}
