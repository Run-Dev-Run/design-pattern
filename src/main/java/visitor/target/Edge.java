package visitor.target;

public class Edge {
    private boolean inPrivateMode = false;
    private EdgeColor color;

    public void setInPrivateMode(boolean b) {
        this.inPrivateMode = b;
    }

    public void setEdgeColor(EdgeColor color) {
        this.color = color;
    }
}
