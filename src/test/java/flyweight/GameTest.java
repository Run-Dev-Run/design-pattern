package flyweight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import util.Benchmark;

public class GameTest {
    int TEST_SIZE = 1000000;
    @DisplayName("flyweight 패턴의 사용과 미사용 비교")
    @Test
    void run() {
        var forFlyweight =
            new Benchmark(() -> new Game(1000000).run()).run();
        var forNormal =
            new Benchmark(() -> new Game(1000000).run()).run();
    }

    private void forFlyweight() {
        new Game(TEST_SIZE).run();
    }

    private void forNormal() {
    }
}
