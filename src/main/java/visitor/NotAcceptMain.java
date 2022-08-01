package visitor;

import visitor.impl.BrowserSetAnonymousVisitor;
import visitor.impl.BrowserSetDarkModeVisitor;
import visitor.target.Chrome;
import visitor.target.Edge;
import visitor.target.Firefox;

/** 방문 메서드(accept)를 구현하지 않았을 경우
 *  인터페이스를 통해 서로를 알아 볼 수 없다.
 * */
public class NotAcceptMain {
    private static boolean SET_DARK_MODE = true;
    private static boolean SET_ANONYMOUS = false;

    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        Edge edge = new Edge();
        Browser firefox = new Firefox();

        // 다크 모드 설정
        if (SET_DARK_MODE) {
            BrowserSetAnonymousVisitor anonymousVisitor = new BrowserSetAnonymousVisitor();
            anonymousVisitor.visit(chrome);
            anonymousVisitor.visit(edge);
            //anonymousVisitor.visit(firefox); // 오류 발생!!
        }

        // 익명 모드 설정
        if (SET_ANONYMOUS) {
            BrowserSetDarkModeVisitor darkModeVisitor = new BrowserSetDarkModeVisitor();
            darkModeVisitor.visit(chrome);
            darkModeVisitor.visit(edge);
            //darkModeVisitor.visit(firefox); // 오류 발생!!
        }
    }
}
