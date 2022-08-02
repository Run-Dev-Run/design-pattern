package visitor.target;

import visitor.Browser;
import visitor.BrowserVisitor;

public class IExplorer implements Browser {
    @Override
    public void accept(BrowserVisitor visitor) {
        visitor.visit(this);
    }
}
