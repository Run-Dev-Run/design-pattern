package visitor;

import visitor.impl.BrowserSetAnonymousVisitor;
import visitor.impl.BrowserSetDarkModeVisitor;
import visitor.target.Chrome;
import visitor.target.Edge;

public class Main {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        Edge edge = new Edge();

        // 익명 모드 설정
        BrowserSetAnonymousVisitor anonymousVisitor = new BrowserSetAnonymousVisitor();
        anonymousVisitor.accept(chrome);
        anonymousVisitor.accept(edge);

        // 다크 모드 설정
        BrowserSetDarkModeVisitor darkModeVisitor = new BrowserSetDarkModeVisitor();
        darkModeVisitor.accept(chrome);
        darkModeVisitor.accept(edge);
    }
}
