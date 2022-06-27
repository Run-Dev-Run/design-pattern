package bridge.abstraction;

import bridge.implementor.Logger;
import bridge.implementor.Mover;

public abstract class Door {
    private final Mover mover;
    private final Logger logger;

    protected Door(Mover mover, Logger logger) {
        this.mover = mover;
        this.logger = logger;
    }

    public final void open() {
        logger.log("문을 열기 위해 문고리를 잡음");
        if (isOpenable()) {
            mover.moveNext();
            logger.log(getDoorName() + " 열었음");
        }
    }

    protected abstract String getDoorName();

    protected abstract boolean isOpenable();
}
