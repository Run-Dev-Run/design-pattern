package memento.ex02;

import java.util.ArrayList;
import java.util.List;

import memento.ex02.SourceCode.SourceCodeSnapShot;

public class CodeHistory {

	private List<SourceCodeSnapShot> codeHistories = new ArrayList<>();

	public void addCodeHistory(SourceCodeSnapShot snapshot) {
		codeHistories.add(snapshot);
	}

	public SourceCodeSnapShot getRecentCode() {
		return codeHistories.get(codeHistories.size() - 1);
	}

}
