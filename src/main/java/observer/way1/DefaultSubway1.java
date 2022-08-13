package observer.way1;

/**
 * 일반열차를 의미
 **/
public class DefaultSubway1 implements EventListener {
    @Override
    public void onEvent(Boolean status) {
        if (status) {
            System.out.println("급행 열차를 먼저 보냅니다.");
        }
    }

    public void start() {
        new FastSubway(this).run();
    }
}
