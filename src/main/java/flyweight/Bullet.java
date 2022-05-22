package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Bullet {
    private static final Map<String, Bullet> cached = new HashMap<>();

    /** 1. 불변성을 지닌 내부 속성들 */
    private final String name;
    private final int damage;
    private final int speed;

    /** 2. 생성자를 숨김 */
    private Bullet(String name, int damage, int speed) {
        this.name = name;
        this.damage = damage;
        this.speed = speed;
    }

    /** 3. 팩토리 메서드를 사용해 인스턴스 생성을 조절 합니다. */
    public static Bullet of(String name, int damage, int speed) {
        if (!cached.containsKey(name)) {
            cached.put(name, new Bullet(name, damage, speed));
        }
        return cached.get(name);
    }
}
