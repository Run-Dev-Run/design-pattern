package observer.way2;

/**
 * 일반열차를 의미
 **/
public class DefaultSubway1 implements SubwayObserver {
    @Override
    public void receive(String message) {
        System.out.println(message);
    }
}
