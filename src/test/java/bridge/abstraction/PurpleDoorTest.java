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
public class PurpleDoorTest {
    @Mock
    private Mover mover;
    @Mock
    private Logger logger;
    private PurpleDoor door;

    @BeforeEach
    void setUp() {
        door = new PurpleDoor(logger);
    }

    @DisplayName("보라색문은 '보라색'이라는 이름을 반환한다.")
    @Test
    void getDoorName() {
        final String EXPECTED = "보라색";

        String actual = door.getDoorName();
        assertThat(actual).isEqualTo(EXPECTED);
    }

    @DisplayName("갈색문은 3번 열어야 열린다.")
    @Test
    void open() {
        assertThat(door.isOpenable()).isFalse();
        assertThat(door.isOpenable()).isFalse();
        assertThat(door.isOpenable()).isTrue();
    }
}
