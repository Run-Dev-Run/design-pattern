package memento.ex01;

public class ScmApplication {

	private CodeHistory codeHistory = new CodeHistory();

	public void commit(SourceCode sourceCode) {
		codeHistory.addCodeHistory(sourceCode.getCode());
	}

	public SourceCode rollback(SourceCode sourceCode) {
		String recentCode = codeHistory.getRecentCode();
		sourceCode.setCode(recentCode);

		return sourceCode;
	}

}
