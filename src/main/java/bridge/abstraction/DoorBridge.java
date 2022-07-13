package bridge.abstraction;

import bridge.implementor.Mover;

public abstract class DoorBridge {
    public final void open(Mover mover) {
        if (isOpenable()) {
            mover.moveNext();
        }
    }

    protected abstract String getDoorName();

    protected abstract boolean isOpenable();
}
