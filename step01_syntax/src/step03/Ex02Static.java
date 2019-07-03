/* 학습내용
 * 1. static 변수
 * 	1. 호출 문법: class명. 변수, 변수, 참조변수.변수
 * 	2. 특징
 * 		- 생성되는 모든 객체가 공유하는 자원
 * 		- 
 */
package step03;

public class Ex02Static {
	int no1;
	static int no2;
	
	Ex02Static() {
		no1 = no1+1;
		no2 = no2+1;
	};

	public static void main(String[] args) {
		
	}

}
