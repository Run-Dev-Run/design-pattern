package bridge.abstraction;

import bridge.implementor.Logger;
import bridge.implementor.Mover;

public class BrownDoor extends Door {
    private static final String NAME = "갈색";

    private int openCounter = 0;

    protected BrownDoor(Logger logger) {
        super(logger);
    }

    @Override
    protected String getDoorName() {
        return NAME;
    }

    @Override
    protected boolean isOpenable() {
        return ++openCounter == 5;
    }
}
