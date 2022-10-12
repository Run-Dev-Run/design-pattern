package bridge.implementor;

public class Human implements Mover {
    private int roomLocation = 0;

    @Override
    public void moveNext() {
        roomLocation += 1;
        System.out.println("사람이 이동 했습니다!!!");
    }

    public int getRoomLocation() {
        return roomLocation;
    }
}
