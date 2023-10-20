package 策略模式.ChainOfResponsibility;

/**
 * Created by wm on 2018/11/6.
 */
public class ErrorLogger  extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
