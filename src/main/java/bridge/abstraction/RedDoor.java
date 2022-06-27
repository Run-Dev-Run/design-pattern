package bridge.abstraction;

import bridge.implementor.Logger;
import bridge.implementor.Mover;

public class RedDoor extends Door {
    private static final String NAME = "빨간색";

    protected RedDoor(Mover mover, Logger logger) {
        super(mover, logger);
    }

    @Override
    protected String getDoorName() {
        return NAME;
    }

    @Override
    protected boolean isOpenable() {
        return false;
    }
}
