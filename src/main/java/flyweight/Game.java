package flyweight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Game {
    private static final String BULLET_NAME = "9mm";
    private static final int BULLET_DAMAGE = 10;
    private static final int BULLET_SPEED = 100;

    private final int gunSize;

    public Game(int gunSize) {
        this.gunSize = gunSize;
    }

    public void run() {
        createBullets().forEach(eachBullet -> renderBullet(eachBullet, 0, 0));
    }

    private List<Bullet> createBullets() {
        return Stream.generate(() -> Bullet.of(BULLET_NAME, BULLET_DAMAGE, BULLET_SPEED))
                     .limit(gunSize)
                     .collect(Collectors.toList());
    }

    private void renderBullet(Bullet bullet, int x, int y) {
        /** 화면에 Bullet을 렌더링 하는 메서드 */
        /** 이 때 Bullet의 좌표 값인 x, y는 클라이언트가 정의하는 외부 속성이 됩니다. */
    }
}
