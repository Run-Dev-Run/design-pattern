package memento.ex02;

public class SourceCode {
	private String code;

	private String trash;

	public SourceCode(String code, String trash) {
		this.code = code;
		this.trash = trash;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void showCurrentCode() {
		System.out.println(code);
	}

	public SourceCodeSnapShot getSnapShot() {
		return new SourceCodeSnapShot(code);
	}

	public SourceCode undo(SourceCodeSnapShot snapShot) {
		this.code = snapShot.getCodeSnapShot();
		return this;
	}

	public static class SourceCodeSnapShot {

		private String codeSnapShot;

		protected SourceCodeSnapShot(String codeSnapShot) {
			this.codeSnapShot = codeSnapShot;
		}

		private String getCodeSnapShot() {
			return codeSnapShot;
		}

	}

}
