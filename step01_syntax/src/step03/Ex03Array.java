/* 학습 내용
 * 1. 배열
 * 	- 데이터들의 저장소
 *  - 하나의 변수로 다수의 데이터 관리
 *  - 1, 2, 3 저장시 3개의 변수가 필요. But 배열을 사용하면 하나의 변수로 3개의 데이터 관리
 *  	: 데이터는 3개 관리하는 변수는 하나. 이때 데이터 구분은 고유한 index[순번]
 * 2. 특징
 * 	1. 기본타입, 참조타입 모두 배열화 가능
 * 	2. 모든 배열은 무조건 객체		// 객체 생성 방식으로 초기화 없이 로컬 공간에서도  생성 가능 // int [] i = new int[2];
 * 		- 자바 객체들이 저장되는 메모리 heap에 저장	// heap에 저장했다 => 초기화 자동으로 진행
 * 		- 멤버변수 자동 초기화처럼 배열도 초기화
 * 	3. 생성된 메모리의 개수값을 보유한 length 변수가 자동 생성 // a[].length ??
 * 
 * 	cf)
 *  	- 로컬 변수는 자동 초기화 불가
 *  	- 참조타입
 *  		1. API
 *  		2. 사용자 정의 타입(class와 interface)
 *  		3. 배열 - 기본타입, 참조타입
 *  
 */
package step03;

public class Ex03Array {
	//Student 한 명의 정보로 데이터 생성 후에 반환
	
	//Array문법 학습
	//기본타입 -> 참조타입 -> parameter -> 반환타입
	static int[] array1() {
		//선언, 생성, 초기화 분리
		int[] i = new int[2];	// 선언, 객체 생성	// 배열은 class, interface없이도 객체 생성 가능. 배열은 객체다. int[] 배열이다. int[]는 객체다
		i[0] = 10; // 초기화
		i[1] = 20;
		System.out.println(i[0] + " " + i.length);
		
		//선언, 생성, 초기화 단일 문장으로 처리
		int[] i2 = {30, 40};	// 이렇게 해도 배열은 무조건 객체다.
		System.out.println(i2[0] + " " + i.length);
		
		//int[] i3 = ArrayUtils.addAll(i, i2); // 두 배열 어떻게 합치나?
		//
		return i2;
	}
	
	static void printArray(int[] i) {
		System.out.println(i[0] + " " + i.length);
	}
	//Array에 Student를 저장해서 반환
	public static void main(String[] args) {
		int[] v = array1();	// int[] 0 30, 40
		//length 변수값은 명시적으로 배열변수.length로 호출해야 함
		
		System.out.println();
		
		for(int data : v) { // 개발자들이 저장한 데이터값에 한해서만 활용
			System.out.println(data);
		}
	}

}
/* int[] i2 = {30, 40}
 * i2라는 변수가 stack에 생성, 단 어떠한 값도 없음
 * {30, 40}으로 heap에 int[] 배열 객체 생성 -> 0번째 30, 1번째 40, length 2
 * 완벽한 배열 객체를 i2에 대입
 * 
 * i2는 stack에 저장, i2는 참조(객체)타입, {30, 40}은 heap에 생성
 */

