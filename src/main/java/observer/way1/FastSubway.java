package observer.way1;

/**
 * 급행열차를 의미
 **/
public class FastSubway {
    private final EventListener eventListener;

    public FastSubway(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public void run() {
        for (int i = 0; i < 100; i = i + 5) {
            eventListener.onEvent(true);
        }
    }
}
