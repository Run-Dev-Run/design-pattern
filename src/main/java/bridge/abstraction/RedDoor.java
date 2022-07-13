package bridge.abstraction;

public class RedDoor extends DoorBridge {
    private static final String NAME = "빨간색";

    @Override
    protected String getDoorName() {
        return NAME;
    }

    @Override
    protected boolean isOpenable() {
        return false;
    }
}
