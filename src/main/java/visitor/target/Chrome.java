package visitor.target;

import visitor.Browser;
import visitor.BrowserVisitor;

public class Chrome implements Browser {
    private boolean secureMode = false;
    private boolean darkMode = false;

    public void setSecureMode(boolean b) {
        this.secureMode = b;
    }

    public void setDarkMode(boolean b) {
        this.darkMode = b;
    }

    @Override
    public void accept(BrowserVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Chrome{" +
                "secureMode=" + secureMode +
                ", darkMode=" + darkMode +
                '}';
    }
}
