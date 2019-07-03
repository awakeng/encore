/* 주 목적 : 학생 정보용 프로그램
 * 1. 학생 한 명의 정보를 표현
 * 2. 주의사항: 다른 학생의 정보와 혼용 불가
 * 			- static 키워드 사용 불가
 * 3. 사용
 * 	- 학생 수만큼 객체 생성
 * 4. 학생 정보
 * 	- 이름, 학번 ...
 * 5. 유효성 로직
 */
package model.domain;

public class Student {
	private String name;
	private long privateNo;
	public Student() {}
	public Student(String name, long privateNo) {
		this.name = name;
		this.privateNo = privateNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrivateNo() {
		return privateNo;
	}
	public void setPrivateNo(long privateNo) {
		this.privateNo = privateNo;
	}
	
	// 멤버 변수값 조합해서 하나의 문자열로 반환하는 메소드 추가
	public String toString() {
		return name + " " + privateNo;
	}
}
