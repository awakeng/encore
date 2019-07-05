package step04.pattern;

public class Admin {
	static Log4J log = Log4J.getInstance();
	
	//진정한 관리자가 admin이라는 id값으로 login시 호출되는 메소드라 가정
	//정상 실행이라 가정
	public static void login() {
		System.out.println(log.info());
		//..
	}
	//관리자가 아님에도 고객이 관리자처럼 로그인 시도시 실행되는 메소드라 가정
	public static void loginFail() {
		System.out.println(log.warn());
		//..
	}
	//?....
	
}
