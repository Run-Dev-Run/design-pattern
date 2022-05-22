package flyweight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Game {
    private final int gunSize;

    public Game(int gunSize) {
        this.gunSize = gunSize;
    }

    public void run() {
        createGrus().forEach(eachGun -> renderBullet(eachGun.fire(), 0, 0));
    }

    private List<Gun> createGrus() {
        return Stream.generate(Gun::new)
                     .limit(gunSize)
                     .collect(Collectors.toList());
    }

    private void renderBullet(Bullet bullet, int x, int y) {
        /** 화면에 Bullet을 렌더링 하는 메서드 */
        /** 이 때 Bullet의 좌표 값인 x, y는 클라이언트가 정의하는 외부 속성이 됩니다. */
    }
}
