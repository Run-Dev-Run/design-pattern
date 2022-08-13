package observer.way2;

import java.util.ArrayList;
import java.util.List;

public class SubwayPlatform {
    private List<SubwayObserver> subways = new ArrayList<>();

    public void attach(SubwayObserver observer) {
        subways.add(observer);
    }

    public void detach(SubwayObserver observer) {
        subways.remove(observer);
    }

    public void notice(String message) {
        subways.forEach(observer -> observer.receive(message));
    }
}
