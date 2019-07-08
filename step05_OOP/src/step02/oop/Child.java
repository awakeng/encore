//코드로 보느 자바의 상속 관계
/* 필수 암기 사항
 * 1. 객체 생성 - instance
 * 	: heap이라는 메모리에 사용 가능하게 멤버 변수들 생성
 * 2. Parent 생성자 실행 완료
 * 	: Parent 객체 생성, name와 age변수를 사용 가능하게 생성
 * 3. 
 */

package step02.oop;

class Parent extends Object{
	String name;
	int age;
	
	Parent() {
		super();
		System.out.println("부모");
	}
	void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Child extends Parent{
	String job;
	public Child() {
		super();
		System.out.println("자식");
	}
	void printAll() {			//재정의, overriding/override
//		System.out.println(name);
//		System.out.println(age);
		super.printAll();
		System.out.println(job);
	}
	
	static Object returnString() {	// <= Object o = "string"; 객체 타입간의 자동 형변환
		return "string";
	}
	
	public static void main(String[] args) {
		
//		String data = returnString();
		String data = (String)returnString();
		System.out.println(data);
		
		
		Child c = new Child();
		c.name = "이현준";
		c.age = 25;
		c.job = "IT man";
		c.printAll();
		
		// 상위 타입이 하위 타입 수용 - 다형성
		Parent p = new Child();
		p.name = "자식맨";
		p.age = 10;
		//p.job = "it";
		Child c2 = (Child) p;		// 객체 타입간의 형 변환 (명시적인 형 변환)
		c2.job = "it";
		//static이 아니기 때문에 new를 통해서 객체를 생성해야 한다.
		//new가 단 한 번 선언되었기 때문에 객체는 1개 뿐! p, c2는 Child의 객체 하나를 공유하고 있다.
	}

}
