package bridge.abstraction;

public class PurpleDoor extends DoorBridge {
    private static final String NAME = "보라색";

    private int openCounter = 0;

    @Override
    protected String getDoorName() {
        return NAME;
    }

    @Override
    protected boolean isOpenable() {
        return ++openCounter == 3;
    }
}
