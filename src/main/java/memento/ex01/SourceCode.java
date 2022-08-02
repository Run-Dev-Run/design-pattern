package memento.ex01;

public class SourceCode {
	private String code;

	private String trash;

	public SourceCode(String code, String trash) {
		this.code = code;
		this.trash = trash;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void showCurrentCode() {
		System.out.println(code);
	}

}
