package visitor;

import visitor.impl.BrowserSetAnonymousVisitor;
import visitor.impl.BrowserSetDarkModeVisitor;
import visitor.target.Chrome;
import visitor.target.Edge;
import visitor.target.Firefox;

import java.util.ArrayList;
import java.util.List;

/** 방문 메서드(accept)를 구현 했을 경우
 *  인터페이스를 통해 서로를 알아 볼 수 있다.
 * */
public class Main {
    private static boolean SET_DARK_MODE = true;
    private static boolean SET_ANONYMOUS = true;

    public static void main(String[] args) {
        List<Browser> browsers = List.of(
                new Chrome(),
                new Edge(),
                new Firefox()
        );
        List<BrowserVisitor> visitors = visitors();
        for (Browser eachBrowser : browsers) {
            visit(eachBrowser, visitors);
        }
        browsers.forEach(System.out::println);

    }

    private static List<BrowserVisitor> visitors() {
        List<BrowserVisitor> visitors = new ArrayList<>();
        if (SET_ANONYMOUS) {
            visitors.add(new BrowserSetAnonymousVisitor());
        }
        if (SET_DARK_MODE) {
            visitors.add(new BrowserSetDarkModeVisitor());
        }
        return visitors;
    }

    private static void visit(Browser browser, List<BrowserVisitor> visitor) {
        for (BrowserVisitor eachVisitor : visitor) {
            browser.accept(eachVisitor);
        }
    }
}
