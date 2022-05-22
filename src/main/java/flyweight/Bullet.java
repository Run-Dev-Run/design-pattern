package flyweight;

public class Bullet {
    private final String name;
    private final int damage;
    private final int speed;

    public Bullet(String name, int damage, int speed) {
        this.name = name;
        this.damage = damage;
        this.speed = speed;
    }
}
