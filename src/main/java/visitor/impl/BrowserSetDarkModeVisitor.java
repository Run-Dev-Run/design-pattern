package visitor.impl;

import visitor.BrowserVisitor;
import visitor.target.*;

public class BrowserSetDarkModeVisitor implements BrowserVisitor {
    @Override
    public void visit(Chrome chrome) {
        chrome.setDarkMode(true);
    }

    @Override
    public void visit(Firefox firefox) {
        firefox.setLightMode(false);
    }

    @Override
    public void visit(Edge edge) {
        edge.setEdgeColor(EdgeColor.BLACK);
    }

    @Override
    public void visit(IExplorer iExplorer) {
        throw new EndOfIExplorerException();
    }
}
