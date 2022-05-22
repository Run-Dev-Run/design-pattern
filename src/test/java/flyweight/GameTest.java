package flyweight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import util.Benchmark;
import util.Benchmark.BenchmarkData;

public class GameTest {
    private static final String BULLET_NAME = "9mm";
    private static final int BULLET_DAMAGE = 10;
    private static final int BULLET_SPEED = 100;

    long TEST_SIZE = 10_000_000;
    @DisplayName("flyweight 패턴의 사용과 미사용 비교")
    @Test
    void run() {
        BenchmarkData forNoneFlyweight = new Benchmark(this::forNoneFlyweight).run();
        BenchmarkData forFlyweight = new Benchmark(this::forFlyweight).run();

        System.out.println("-------------------");
        System.out.println("FlyWeight 패턴 미 사용 시");
        forNoneFlyweight.print();

        System.out.println("-------------------");
        System.out.println("FlyWeight 패턴 사용 시");
        forFlyweight.print();

    }

    private void forFlyweight() {
        Game.run(createFlyweightBullets());
    }

    private List<Bullet> createFlyweightBullets() {
        return Stream.generate(() -> Bullet.of(BULLET_NAME, BULLET_DAMAGE, BULLET_SPEED))
                     .limit(TEST_SIZE)
                     .collect(Collectors.toList());
    }

    private void forNoneFlyweight() {
        Game.run(createNoneFlyweightBullets());
    }

    private List<Bullet> createNoneFlyweightBullets() {
        return Stream.generate(() -> Bullet.ofNoneFlyweight(BULLET_NAME, BULLET_DAMAGE, BULLET_SPEED))
                     .limit(TEST_SIZE)
                     .collect(Collectors.toList());
    }
}
