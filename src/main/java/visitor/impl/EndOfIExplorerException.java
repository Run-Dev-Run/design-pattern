package visitor.impl;

public class EndOfIExplorerException extends RuntimeException {
    public EndOfIExplorerException() {
        super("익스플로러 지원 종료");
    }
}
