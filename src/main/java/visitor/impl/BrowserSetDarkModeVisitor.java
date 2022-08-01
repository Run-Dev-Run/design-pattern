package visitor.impl;

import visitor.BrowserVisitor;
import visitor.target.*;

public class BrowserSetDarkModeVisitor implements BrowserVisitor {
    @Override
    public void accept(Chrome chrome) {
        chrome.setDarkMode(true);
    }

    @Override
    public void accept(Firefox firefox) {
        firefox.setLightMode(false);
    }

    @Override
    public void accept(Edge edge) {
        edge.setEdgeColor(EdgeColor.BLACK);
    }

    @Override
    public void accept(IExplorer iExplorer) {
        throw new EndOfIExplorerException();
    }
}
