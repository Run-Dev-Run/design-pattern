package bridge.abstraction;

import bridge.implementor.Logger;
import bridge.implementor.Mover;

public class PurpleDoor extends Door {
    private static final String NAME = "보라색";

    private int openCounter = 0;

    protected PurpleDoor(Mover mover, Logger logger) {
        super(mover, logger);
    }

    @Override
    protected String getDoorName() {
        return NAME;
    }

    @Override
    protected boolean open(Mover mover) {
        return ++openCounter == 3;
    }
}
