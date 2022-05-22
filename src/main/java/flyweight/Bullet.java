package flyweight;

public class Bullet {
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
}
