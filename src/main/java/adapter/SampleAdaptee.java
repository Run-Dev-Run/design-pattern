package adapter;

public class SampleAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("이것이 어댑터 클래스다");
    }
}
