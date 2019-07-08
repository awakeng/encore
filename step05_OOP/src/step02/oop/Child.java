//�ڵ�� ���� �ڹ��� ��� ����
/* �ʼ� �ϱ� ����
 * 1. ��ü ���� - instance
 * 	: heap�̶�� �޸𸮿� ��� �����ϰ� ��� ������ ����
 * 2. Parent ������ ���� �Ϸ�
 * 	: Parent ��ü ����, name�� age������ ��� �����ϰ� ����
 * 3. 
 */

package step02.oop;

class Parent extends Object{
	String name;
	int age;
	
	Parent() {
		super();
		System.out.println("�θ�");
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
		System.out.println("�ڽ�");
	}
	void printAll() {			//������, overriding/override
//		System.out.println(name);
//		System.out.println(age);
		super.printAll();
		System.out.println(job);
	}
	
	static Object returnString() {	// <= Object o = "string"; ��ü Ÿ�԰��� �ڵ� ����ȯ
		return "string";
	}
	
	public static void main(String[] args) {
		
//		String data = returnString();
		String data = (String)returnString();
		System.out.println(data);
		
		
		Child c = new Child();
		c.name = "������";
		c.age = 25;
		c.job = "IT man";
		c.printAll();
		
		// ���� Ÿ���� ���� Ÿ�� ���� - ������
		Parent p = new Child();
		p.name = "�ڽĸ�";
		p.age = 10;
		//p.job = "it";
		Child c2 = (Child) p;		// ��ü Ÿ�԰��� �� ��ȯ (������� �� ��ȯ)
		c2.job = "it";
		//static�� �ƴϱ� ������ new�� ���ؼ� ��ü�� �����ؾ� �Ѵ�.
		//new�� �� �� �� ����Ǿ��� ������ ��ü�� 1�� ��! p, c2�� Child�� ��ü �ϳ��� �����ϰ� �ִ�.
	}

}
