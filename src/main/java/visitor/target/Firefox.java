package visitor.target;

public class Firefox {
    private boolean privateMode;
    private boolean lightMode = false;

    public void setPrivateMode(boolean b) {
        this.privateMode = b;
    }

    public void setLightMode(boolean b) {
        this.lightMode = b;
    }
}
