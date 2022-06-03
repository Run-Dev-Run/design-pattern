package state;

public class Buntalk {
    public void send(EventState state) {
        state.participate();
        state.provide();
        System.out.println("감사합니다.");
    }
}