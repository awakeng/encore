package step03;

import model.domain.Student;  //ctrl + shift + o

public class Ex04Array {
	//Array 문법 학습
	//배열 참조타입, parameter, 반환타입 연습
	
	static Student[] studentArray() {
		Student[] v = {new Student("신용기", 30), new Student("이준현", 25)};
		return v;
	}
	
	static void printStudentName(Student[] v) {
		for(Student data : v) {
			System.out.println(data.getName());
		}
	}
	
	/*
	 * ? printStudentName(Student[] v){}
	 * 1. 배열 내부의 모든 학생들의 이름들만 출력
	 * 2. 고려사항
	 * 		- name 변수는 직접적인 접근 불가: private
	 * 		- getName() 호출 가능 : public
	 * 3. 제약 조건
	 * 		-for문 활용 필수
	 */
	public static void main(String[] args) {
		Student[] w = studentArray();
		for(Student data : w) {
			System.out.println(data);
		}
		
		printStudentName(w);
	}

}


/*	과제
 *	1. 데이터 선택
 *		- DTO 클래스 개발
 *	2. 해당 DTO 3개 이상의 데이터를 배열에 저장
 *	3. 배열의 저장된 데이터 값들을 출력
 *	4. 구조 및 package명, class명 자유
 *	5. 제약조건 - 최적의 코드로 개발
 *		1. 제시된 로직 완성
 *		2. project명
 *			step01.apply
 *	6. 제출
 *		- 7월 4일 9시 5분까지
 *		- 폴더 제공 예정 
 */
