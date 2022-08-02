package visitor.target;

import visitor.Browser;
import visitor.BrowserVisitor;

public class Firefox implements Browser {
    private boolean privateMode;
    private boolean lightMode = false;

    public void setPrivateMode(boolean b) {
        this.privateMode = b;
    }

    public void setLightMode(boolean b) {
        this.lightMode = b;
    }

    @Override
    public void accept(BrowserVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Firefox{" +
                "privateMode=" + privateMode +
                ", lightMode=" + lightMode +
                '}';
    }
}
