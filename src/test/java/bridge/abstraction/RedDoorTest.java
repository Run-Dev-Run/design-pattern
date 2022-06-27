package bridge.abstraction;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import bridge.implementor.Logger;
import bridge.implementor.Mover;

@ExtendWith(MockitoExtension.class)
public class RedDoorTest {
    @Mock
    private Mover mover;
    @Mock
    private Logger logger;
    private RedDoor door;

    @BeforeEach
    void setUp() {
        door = new RedDoor(logger);
    }

    @DisplayName("빨간색문은 '빨간색'이라는 이름을 반환한다.")
    @Test
    void getDoorName() {
        final String EXPECTED = "빨간색";

        String actual = door.getDoorName();
        assertThat(actual).isEqualTo(EXPECTED);
    }

    @DisplayName("빨간색문은 절대 열리지 않는다.")
    @Test
    void open() {
        for (int i = 0; i < 10000; i++) {
            assertThat(door.isOpenable()).isFalse();
        }
    }
}
