package visitor;

import visitor.target.Chrome;
import visitor.target.Edge;
import visitor.target.Firefox;
import visitor.target.IExplorer;

public interface BrowserVisitor {
    void visit(Chrome chrome);

    void visit(Firefox firefox);

    void visit(Edge edge);

    void visit(IExplorer iExplorer);
}
