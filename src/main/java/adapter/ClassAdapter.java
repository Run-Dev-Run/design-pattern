package adapter;

public class ClassAdapter implements Adaptee, Target {
    public ClassAdapter() {
    }

    @Override
    public void specificRequest() {
        this.specificRequest();
    }

    @Override
    public void request() {
        System.out.println("이것이 어댑터 클래스다");
    }
}
