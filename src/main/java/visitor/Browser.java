package visitor;

public interface Browser {
    void accept(BrowserVisitor visitor);
}
