package bridge.abstraction;

public class BrownDoor extends DoorBridge {
    private static final String NAME = "갈색";

    private int openCounter = 0;

    @Override
    protected String getDoorName() {
        return NAME;
    }

    @Override
    protected boolean isOpenable() {
        return ++openCounter == 5;
    }
}
