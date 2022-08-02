package visitor.target;

import visitor.Browser;
import visitor.BrowserVisitor;

public class Edge implements Browser {
    private boolean inPrivateMode = false;
    private EdgeColor color;

    public void setInPrivateMode(boolean b) {
        this.inPrivateMode = b;
    }

    public void setEdgeColor(EdgeColor color) {
        this.color = color;
    }

    @Override
    public void accept(BrowserVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Edge{" +
                "inPrivateMode=" + inPrivateMode +
                ", color=" + color +
                '}';
    }
}
