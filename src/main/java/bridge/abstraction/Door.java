package bridge.abstraction;

import bridge.implementor.Logger;
import bridge.implementor.Mover;

public abstract class Door {
    private final Logger logger;

    protected Door(Logger logger) {
        this.logger = logger;
    }

    public final void open(Mover mover) {
        logger.log("문을 열기 위해 문고리를 잡음");
        if (isOpenable()) {
            mover.moveNext();
            logger.log(getDoorName() + " 열었음");
        }
    }

    protected abstract String getDoorName();

    protected abstract boolean isOpenable();
}
