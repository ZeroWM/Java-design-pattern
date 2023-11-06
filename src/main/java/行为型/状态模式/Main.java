package 行为型.状态模式;

public class Main {
  public static void main(String[] args) {
    Work work = new Work();
    work.setHour(9);
    work.writeCode();

    work.setHour(15);
    work.writeCode();

    work.setHour(19);
    work.writeCode();
  }

  //  public static void main(String[] args) {
  //    // 创建一个新线程（NEW状态）
  //    Thread thread =
  //        new Thread(
  //            () -> {
  //              System.out.println("Thread is running."); // 当线程启动后，它会打印这个消息
  //            });
  //
  //    System.out.println(thread.getState()); // 输出：NEW
  //
  //    // 启动线程（转变到RUNNABLE状态）
  //    thread.start();
  //
  //    // 主线程等待新创建的线程结束
  //    while (thread.getState() != Thread.State.TERMINATED) {
  //      System.out.println(thread.getState()); // 输出：RUNNABLE
  //      try {
  //        Thread.sleep(500); // 让主线程休眠500毫秒，以便我们可以看到新线程的状态变化
  //      } catch (InterruptedException e) {
  //        e.printStackTrace();
  //      }
  //    }
  //
  //    System.out.println(thread.getState()); // 输出：TERMINATED
  //  }
}
