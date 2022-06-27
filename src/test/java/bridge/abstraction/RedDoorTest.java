package bridge.abstraction;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bridge.implementor.FakeLogger;
import bridge.implementor.FakeMover;
import bridge.implementor.Mover;

public class RedDoorTest {
    private RedDoor door;

    @BeforeEach
    void setUp() {
        door = new RedDoor(new FakeMover(), new FakeLogger());
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
        Mover fakeMover = new FakeMover();

        for (int i = 0; i < 10000; i++) {
            assertThat(door.open(fakeMover)).isFalse();
        }
    }
}
