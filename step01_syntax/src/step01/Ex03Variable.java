/* 학습목표
 * 1. 변수
 * 	1-1. 타입
 * 		a. 기본
 * 			byte, short, int, long
 * 			float, double
 * 			char
 * 			boolean
 * 		b. 참조
 * 			-  all types but primitives 
 * 	1-2. 선언 위치에 따른 구분
 * 		1. 멤버
 * 			- class {} 하위
 * 		2. 로컬
 * 			- 생성자 또는 메소드의 parameter
 */

package step01;
import model.domain.People;; // 타 package에서 import해오기 class명까지 ctrl+space로 정확히 명시하기

public class Ex03Variable {

	public static void main(String[] args) {
		//People 객체 생성 - new People()
		People ppl = new People();
		//People에 "내 짝 이름", 나이(-) 대입, setxxx(값)
		ppl.setName("용기");
		ppl.setAge(-30);
		//People에 getXxx() 호출해서 출력
		System.out.println(ppl.getName()+", "+ppl.getAge());
		/*
		 * System
		 * out
		 * println 대기
		 * p
		 * getName()
		 * +
		 * " "
		 * getAge()
		 * println 실제 실행
		 * ; (종료)
		 */
	}

}
