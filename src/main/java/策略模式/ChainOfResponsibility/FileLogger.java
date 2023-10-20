package 策略模式.ChainOfResponsibility;

/**
 * Created by wm on 2018/11/6.
 */
public class FileLogger  extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
