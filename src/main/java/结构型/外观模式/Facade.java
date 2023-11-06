package 结构型.外观模式;

public class Facade {
  public UserService userService;
  public ResourceService resourceService;

  public Facade() {
    userService = new UserService();
    resourceService = new ResourceService();
  }

  public void doResource() {
    resourceService.doResource();
  }

  public void doUserAndResource() {
    userService.doName();
    resourceService.doResource();
  }
}
