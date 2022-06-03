package state;

public class Main {
    public static void main(String[] args) {
        Buntalk buntalk = new Buntalk();
        buntalk.send(new User());

        buntalk.send(new OutSider());
    }
}