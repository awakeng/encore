/* �н�����
 * 1. �迭�� ���� �޸� ������� �� ū index ������ �����͸� ���
 * 	- �������� ����
 * 	- ������ ����? ���� ����?
 */
package step01;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int [] i = {1, 2, 3};
		System.out.println(i[1]);
		System.out.println(i[2]);//ArrayIndexOutOfBoundsException
		
		int i2 = 10/1;
		System.out.println(i2);//java.lang.ArithmeticException
		
//		String s = null;
//		System.out.println(s.length());//java.lang.NullPointerException
		
		String s2 = "3";
		int i3 = Integer.parseInt(s2);//? java.lang.NumberFormatException

		B b = new B();
		//B c = new C();//����
		A a = new B();
		A ac = new A();
		A ac2 = new C();
		A a2 = new C();
		
		B bb = (B)a;
		//C cc = (C)a;//java.lang.ClassCastException
		
		
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);//false
		
		System.out.println(b instanceof B);
		//System.out.println(b instanceof C);// ����		
		
		System.out.println(ac instanceof A);
		System.out.println(ac instanceof C);
		System.out.println(ac2 instanceof A);
		System.out.println(ac2 instanceof C);
		System.out.println(b instanceof A);		// �ڽ� Ŭ������ ��ü���� ������ �θ� Ŭ������ ���Ѵ�
												// ������ �θ� Ŭ������ ��ü���� �ڽ� Ŭ������ ���� �Ƿ��� �ڽ� Ŭ������ �����ؼ� �θ� Ÿ���� ��ü�� �����ؾ� �Ѵ�.
														//	Parent p = new Child();		
	}
}

class A{}
class B extends A{}
class C extends A{}