package bridge.abstraction;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import bridge.implementor.Mover;

@ExtendWith(MockitoExtension.class)
public class BrownDoorTest {
    @Mock
    private Mover mover;
    @Mock
    private Logger logger;

    private BrownDoor door;

    @BeforeEach
    void setUp() {
        door = new BrownDoor(logger);
    }

    @DisplayName("갈색문은 '갈색'이라는 이름을 반환한다.")
    @Test
    void getDoorName() {
        final String EXPECTED = "갈색";

        String actual = door.getDoorName();
        assertThat(actual).isEqualTo(EXPECTED);
    }

    @DisplayName("갈색문은 5번 열어야 열린다.")
    @Test
    void open() {
        assertThat(door.isOpenable()).isFalse();
        assertThat(door.isOpenable()).isFalse();
        assertThat(door.isOpenable()).isFalse();
        assertThat(door.isOpenable()).isFalse();
        assertThat(door.isOpenable()).isTrue();
    }
}
