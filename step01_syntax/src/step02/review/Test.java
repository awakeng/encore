// �̿ϼ� �Ǵ� �������� �ڵ� -> ���� �ڵ�� �ϼ� �� �����ϱ�!
package step02.review;

public class Test {
	
	static String name;
	char id= 't';		// char �� ' ' �� ���� ������ �뷮�� 2 byte�� ���ĺ� �� ������ �ִ��̴�.
	int age = 10;
	
	
	public static void main(String[] args) {
		Test t = new Test();
		t.name = "encore";
		System.out.println(t.id + " " + t.age + " " + t.name); //t 10 encore

	}

}
