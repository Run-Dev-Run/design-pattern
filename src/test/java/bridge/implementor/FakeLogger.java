package bridge.implementor;

import java.util.ArrayList;
import java.util.List;

public class FakeLogger implements Logger {
    private final List<String> logs = new ArrayList<>();

    @Override
    public void log(String content) {
        logs.add(content);
    }

    public List<String> getLogs() {
        return logs;
    }
}
