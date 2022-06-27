package bridge.implementor;

public class PrintLogger implements Logger {
    @Override
    public void log(String content) {
        System.out.println(content);
    }
}
