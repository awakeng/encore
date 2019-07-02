/* 학습내용
 * 1. 기초 문법 습득
 * 2. 데이터
 * 	- 오늘 식사한 친구의 이름과 나이로 프로그램 만들기
 * 3. 기능
 * 	- 데이터 저장, 나이값을 동적으로 증가 기능, 데이터 제공 기능
 * 4. 설계
 * 	1) 각 기능별 메소드를 개별로 개발
 * 	2) 실제 사용 가능한 메모리를 시스템 내부적으로 생성, 활용
 * 5. 개발 설계
 * 	1) 데이터를 저장하고자 하는 메모리는 총 몇 개? --> 이름&나이
 * 	2) 문법으로 실행하면서 내부적으로 그러한 동작처럼 실행
 * 		- 제시된 방법? = 객체 생성
 * 	3) 주의 사항
 * 		- 클래스 개발 자체가 객체 생성을 의미하는 게 절대 아님
 */
package step01;

public class Ex02People {
	// 문자열 - 멤버 변수
	String name;
	// int 
	int age;
	
	// 생성자
	Ex02People(){}
	// () 는 값을 받고 {}는 로직을 형성한다.
	
	// 메소드   (클래스 네임이랑 이름이 같아도 앞에 void가 있으먄 메소드로 취급한다.)
	// 마찬가지로 int이 앞에 와도, result가 잇으면 메소드이ㅏ다.)
	void addAge(int addAge) { // 로컬 변수 (addAge)
		age = age + addAge;
	}
	//age 변수값 제공하는 메소드
	/*
	 *  1. 메소드 명?
	 *  2. 해당 변수값 반환 따라서 변수 타입을 명확히 파아 후에 메소드 반환타입으로 설장: int
	 */
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		// 실제 사용 가능하게 메모리에 생성하기 - 객체 생성
		// new 생성자 호출로 사용자 정의 데이터 표현, 단 변수 타입도 사용자 정의 타입
		Ex02People people = new Ex02People();
		/// people은 객체를 관리하는 변수 (객체 주솟값?)
		
		// 객체가 저장된 단순 주소값 출력
		System.out.println(people);
		// 메모리에 원하는 데이터로 저장하기 
		people.name = "김경원";
		people.age = 27;
		// 메모리에 저장된 데이터 가져와서 출력하기 - 데이터 획득 및 활용
		
		System.out.println(people.getName());
		/*
		 * System.out
		 * System.out.print 대기
		 * 
		 */
	}

}
