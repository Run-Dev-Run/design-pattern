package bridge.abstraction;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import bridge.implementor.Logger;
import bridge.implementor.Mover;

@ExtendWith(MockitoExtension.class)
public class DoorTest {
    @InjectMocks
    private FakeDoor door;
    @Mock
    private Mover mover;
    @Mock
    private Logger logger;

    @DisplayName("문을 열려고할때 로그를 기록한다.")
    @Test
    void openingLog() {
        door.open();
        verify(logger)
               .log(eq("문을 열기 위해 문고리를 잡음"));
    }

    @DisplayName("문이 열렸을때 사람을 다음방으로 이동 시킨다.")
    @Test
    void openedMoveNext() {
        door.openable = true;
        door.open();
        verify(mover).moveNext();
    }

    private static class FakeDoor extends Door {
        private static final String NAME = "가짜문";
        private boolean openable = false;

        protected FakeDoor(Mover mover, Logger logger) {
            super(mover, logger);
        }

        @Override
        protected String getDoorName() {
            return NAME;
        }

        @Override
        protected boolean isOpenable() {
            return openable;
        }
    }
}
