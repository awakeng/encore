/* 학습내용
 * 1. 반복문 학습
 * 2. 종류
 * 	1. for : 반복 횟수가 정확한 경우 주로 사용
 * 		1. 정통
 * 			for(변수 선언 및 초기화; 조건식; 증감식 영역;){
 * 				조건식이 true인 경우 실행
 * 			} 
 * 		2. for Each
 * 
 * 2. while : 반복 횟수가 불명확 도는 무한 loop
 * 		1과 2 : 반복 조건이 true인 경우에만 실행
 * 
 * 		초기식;
 * 		while(조건식){
 * 			조건식이 true인 경우 실행
 * 			증감식;
 * 		}
 * 3. do~while : 반복 조건 검증전에 무조건 한 번 실행 후 반복 조건 검증
 * 		초기식;
 * 		do{
 * 			실행 로직과 증감식;
 * 		}while(조건식);
 */
package step01;

public class Ex06Loop {
	//for	1	2	3	4	5
	static void forM() {
		for(int v=1; v<=5; v+=1) {
			System.out.print(v + "\t");
		}
		System.out.println();
	}
	//while
	static void whileM() {
		int i = 0;
		while(i < 5) {
			System.out.print(++i + "\t");
		}
		System.out.println();
	}
	//do~while
	static void doWhileM() {
		int i = 0;
		do {
			System.out.print(++i + "\t");
		}while(i<5);
		System.out.println();
	}
	public static void main(String[] args) {
		forM(); whileM(); doWhileM();
	}

}
