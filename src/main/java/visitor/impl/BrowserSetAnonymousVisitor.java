package visitor.impl;

import visitor.BrowserVisitor;
import visitor.target.Chrome;
import visitor.target.Edge;
import visitor.target.Firefox;
import visitor.target.IExplorer;

public class BrowserSetAnonymousVisitor implements BrowserVisitor {
    @Override
    public void visit(Chrome chrome) {
        chrome.setSecureMode(true);
    }

    @Override
    public void visit(Firefox firefox) {
        firefox.setPrivateMode(true);
    }

    @Override
    public void visit(Edge edge) {
        edge.setInPrivateMode(true);
    }

    @Override
    public void visit(IExplorer iExplorer) {
        throw new EndOfIExplorerException();
    }
}
