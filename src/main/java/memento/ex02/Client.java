package memento.ex02;

import memento.ex02.SourceCode.SourceCodeSnapShot;

public class Client {

	public static void main(String[] args) {
		ScmApplication scmApplication = new ScmApplication();

		// 코드 작성 후 커밋
		String myCode = "printf('Hello World')";
		String myTrash = "Trash~~!!!!!!!!!!";

		SourceCode mySourceCode = new SourceCode(myCode, myTrash);
		SourceCodeSnapShot snapShot = mySourceCode.getSnapShot();
		scmApplication.commit(snapShot);
		mySourceCode.showCurrentCode();

		// 코드 변경
		mySourceCode.setCode("printf('New Source Code')");
		mySourceCode.showCurrentCode();

		// 코드 롤백
		SourceCode rollbackSourceCode = scmApplication.rollback(mySourceCode);
		rollbackSourceCode.showCurrentCode();

	}

}
