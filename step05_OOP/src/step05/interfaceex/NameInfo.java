package step05.interfaceex;

public interface NameInfo {
	//회사명을 상수
	public static final String COMPANY_NAME = "encore";

	//public static final 자동 반영 (interface에서는 자동으로 반영된다!! -> 상수처리 된다.)
	int HISTORY = 20;
	
	
	//회사에 종사하는 직원명을 반환하는 메소드, 재정의 필수, 니 이름 반환
	public abstract String getName();
}

