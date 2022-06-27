package bridge.implementor;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HumanTest {
    @DisplayName("다음방으로 이동하면 사람의 방 위치가 1 증가합니다.")
    @Test
    void moveNext() {
        Human human = new Human();

        human.moveNext();
        assertThat(human.getRoomLocation()).isEqualTo(1);
    }
}
