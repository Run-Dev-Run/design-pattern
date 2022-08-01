package visitor;

import visitor.target.Chrome;
import visitor.target.Edge;
import visitor.target.Firefox;
import visitor.target.IExplorer;

public interface BrowserVisitor {
    void accept(Chrome chrome);

    void accept(Firefox firefox);

    void accept(Edge edge);

    void accept(IExplorer iExplorer);
}
