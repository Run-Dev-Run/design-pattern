package bridge.implementor;

public class Human implements Mover {
    @Override
    public void moveNext() {
        System.out.println("이동 했습니다!!!");
    }
}
