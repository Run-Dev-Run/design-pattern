package memento.ex01;

public class Client {

	public static void main(String[] args) {
		ScmApplication scmApplication = new ScmApplication();

		// 코드 작성 후 커밋
		String myCode = "printf('Hello World')";
		String myTrash = "Trash~~!!!!!!!!!!";

		SourceCode mySourceCode = new SourceCode(myCode, myTrash);
		scmApplication.commit(mySourceCode);
		mySourceCode.showCurrentCode();

		// 코드 변경
		mySourceCode.setCode("printf('New Source Code')");
		mySourceCode.showCurrentCode();

		// 코드 롤백
		SourceCode rollbackSourceCode = scmApplication.rollback(mySourceCode);
		rollbackSourceCode.showCurrentCode();

	}

}
