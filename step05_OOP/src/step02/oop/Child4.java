package step02.oop;

import lombok.ToString;

class Parent4 extends Object{
	String id;
}
public class Child4 extends Parent4{
	String pw;
	//재정의 룰 : 반환타입 메소드명 argument가 100%
	public String toString() {
		return id;
	}
	
	public static void main(String[] args) {
		String s = "문자열";
		System.out.println(s);
		System.out.println(s.toString());
		
		Child4 c = new Child4();
		c.id = "멤버 id";
		System.out.println(c);
		System.out.println(c.toString());
	}

}
