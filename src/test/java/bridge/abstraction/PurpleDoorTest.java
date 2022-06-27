package bridge.abstraction;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import bridge.implementor.FakeLogger;
import bridge.implementor.FakeMover;
import bridge.implementor.Mover;

public class PurpleDoorTest {
    private PurpleDoor door;

    @BeforeEach
    void setUp() {
        door = new PurpleDoor(new FakeMover(), new FakeLogger());
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
        Mover fakeMover = new FakeMover();

        assertThat(door.open(fakeMover)).isFalse();
        assertThat(door.open(fakeMover)).isFalse();
        assertThat(door.open(fakeMover)).isTrue();
    }
}
