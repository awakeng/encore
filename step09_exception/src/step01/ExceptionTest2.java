package step01;

public class ExceptionTest2 {

	public static void main(String[] args) throws ReflectiveOperationException, ClassNotFoundException {
		/*  class 위치와 class명 만으로 jre에 byte code를 로딩
		 *  API 개발해서 제공하는 API 개발자 관점 - 사용시 발생 가능한 경우의 수
		 *  1. 정상 실행
		 *  	- byte code를 메모리에 로딩 완료
		 *  2. 비정상 실행
		 *  	- 미 존재하는 class명을 잘못 parameter 값으로 부여
		 *  	- api 사용자에게 사전에 이런일 잇을 수 있으니 개발 시점에 경우의 수 처리하겠음 유도
		 *  		: 결론 - 개발하는 시점에 굉장히 견고한 코드로 개발
		 *  				개발 경력과 무관하게 장제적인 안정성 추구 상황 연출
		 */
//		System.out.println(1);
//		try {
//			Class.forName("step01.NameInfo");
//			System.out.println(2);
//		} catch (ClassNotFoundException e) {
////			e.printStackTrace();
//			System.out.println(3);
//		}
//		System.out.println(4);
		Class.forName("step01.NameInfo");
		System.out.println(2);
	}

}
//NameInfo.class 라는 byte code 생성
class NameInfo {
	static {
		System.out.println("지인철");
	}
}