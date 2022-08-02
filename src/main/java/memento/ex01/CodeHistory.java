package memento.ex01;

import java.util.ArrayList;
import java.util.List;

public class CodeHistory {

	private List<String> codeHistories = new ArrayList<>();

	public void addCodeHistory(String code) {
		codeHistories.add(code);
	}

	public String getRecentCode() {
		return codeHistories.get(codeHistories.size() - 1);
	}

}
