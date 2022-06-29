package adapter;

public class Client {
    private final Target targetClassAdapter = new ClassAdapter();
    private final Target targetObjectAdapter = new ObjectAdapter(new SampleAdaptee());

    public void execute() {
        targetClassAdapter.request();
        targetObjectAdapter.request();
    }
}
