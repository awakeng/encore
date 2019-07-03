// 미완성 또는 부적합한 코드 -> 정상 코드로 완성 및 실행하기!
package step02.review;

public class Test {
	
	static String name;
	char id= 't';		// char 은 ' ' 을 쓰고 데이터 용량이 2 byte라 알파벳 한 음절이 최대이다.
	int age = 10;
	
	
	public static void main(String[] args) {
		Test t = new Test();
		t.name = "encore";
		System.out.println(t.id + " " + t.age + " " + t.name); //t 10 encore

	}

}
