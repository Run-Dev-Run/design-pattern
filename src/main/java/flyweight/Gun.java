package flyweight;

public class Gun {
    private static final String BULLET_NAME = "9mm";
    private static final int DAMAGE = 10;
    private static final int SPEED = 10;

    public Bullet fire() {
        return Bullet.of(BULLET_NAME, DAMAGE, SPEED);
    }
}
