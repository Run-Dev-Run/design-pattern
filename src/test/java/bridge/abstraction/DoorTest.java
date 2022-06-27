package bridge.abstraction;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bridge.implementor.FakeLogger;
import bridge.implementor.FakeMover;
import bridge.implementor.Logger;
import bridge.implementor.Mover;

public class DoorTest {
    private DoorImpl door;
    private FakeLogger logger;

    @BeforeEach
    void setUp() {
        logger = new FakeLogger();
        door = new DoorImpl(new FakeMover(), logger);
    }

    @DisplayName("문을 열려고할때 로그를 기록한다.")
    @Test
    void openingLog() {
        door.open();
        assertThat(logger.getLogs()).contains("문을 열기 위해 문고리를 잡음");
    }


    @DisplayName("문이 열렸을때 로그를 기록한다.")
    @Test
    void openedLog() {
        door.open();
        assertThat(logger.getLogs()).doesNotContain("가짜문 열었음");

        door.open = true;
        door.open();
        assertThat(logger.getLogs()).contains("가짜문 열었음");
    }

    private static class DoorImpl extends Door {
        private boolean open = false;

        protected DoorImpl(Mover mover, Logger logger) {
            super(mover, logger);
        }

        @Override
        protected String getDoorName() {
            return "가짜문";
        }

        @Override
        protected boolean open(Mover mover) {
            return open;
        }
    }
}
