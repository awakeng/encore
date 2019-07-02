/* 사람의 정보만 보유하게 되는 구조
 * 정보를 제공, 수정하는 기능
 * 단, age는 살 이상이 데이터만 허용: 유효성 검증
 * *age 개발 관점
 * 	1. 외부에서 32bit int(+ -)의 데이터 중 1 이상인 데이터만 대입되게 구현 
 * 	2. age라는 변수를 직접 호출하면 32bit의 모든 데이터 다 대입 받기 때문에 변수 호출 차단
 * 		- private로 은닉
 * 	3. 공개된 메소드로 유효성 검증 로직 반영해서 1 이상인 데이터만 저장
 * 		- public 추가 메소드 개발
 */
package model.domain;

public class People {
	private String name;
	private int age;
	public People() {}
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0)
			this.age = age;
		else
			System.out.println("값이 무효합니다.");
	}
//	//생성자
//	public People() {}
//	//객체 생성 시점에 사용자가 원하는 데이터로 객체의 멤버들값 대입(초기화)
//	public People(String n, int a) {
//		name = n;
//		age = a;
//	}
	
	
	
	//name 변수값 수정, 제공하는 2가지 메소드
	
	//age 변수값 수정, 제공하는 2가지 메소드  // 한국 사람: 1살 이상인 경우의 데이터만 하용:: 조건식 삽입
	
}


