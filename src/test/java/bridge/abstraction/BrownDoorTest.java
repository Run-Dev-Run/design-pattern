package bridge.abstraction;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bridge.implementor.FakeLogger;
import bridge.implementor.FakeMover;
import bridge.implementor.Mover;

public class BrownDoorTest {
    private BrownDoor door;

    @BeforeEach
    void setUp() {
        door = new BrownDoor(new FakeMover(), new FakeLogger());
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
        Mover fakeMover = new FakeMover();

        assertThat(door.open(fakeMover)).isFalse();
        assertThat(door.open(fakeMover)).isFalse();
        assertThat(door.open(fakeMover)).isFalse();
        assertThat(door.open(fakeMover)).isFalse();
        assertThat(door.open(fakeMover)).isTrue();
    }
}
