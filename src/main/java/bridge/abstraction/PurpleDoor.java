package bridge.abstraction;

import bridge.implementor.Logger;
import bridge.implementor.Mover;

public class PurpleDoor extends Door {
    private static final String NAME = "보라색";

    private int openCounter = 0;

    protected PurpleDoor(Logger logger) {
        super(logger);
    }

    @Override
    protected String getDoorName() {
        return NAME;
    }

    @Override
    protected boolean isOpenable() {
        return ++openCounter == 3;
    }
}
