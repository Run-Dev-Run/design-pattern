package memento.ex02;

import memento.ex02.SourceCode.SourceCodeSnapShot;

public class ScmApplication {

	private CodeHistory codeHistory = new CodeHistory();

	public void commit(SourceCodeSnapShot snapShot) {
		codeHistory.addCodeHistory(snapShot);
	}

	public SourceCode rollback(SourceCode sourceCode) {
		sourceCode.undo(codeHistory.getRecentCode());

		return sourceCode;
	}

}
