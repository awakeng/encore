/* �н�����
 * 1. static ����
 * 	1. ȣ�� ����: class��. ����, ����, ��������.����
 * 	2. Ư¡
 * 		- �����Ǵ� ��� ��ü�� �����ϴ� �ڿ�
 * 		- 
 */
package step03;

public class Ex02Static {
	int no1;
	static int no2;
	
	Ex02Static() {
		no1 = no1+1;
		no2 = no2+1;
	};

	public static void main(String[] args) {
		Ex02Static x1 = new Ex02Static();
		System.out.println(x1.no1 + " " + no2);
		Ex02Static x2 = new Ex02Static();
		System.out.println(x2.no1 + " " + no2);
		Ex02Static x3 = new Ex02Static();
		System.out.println(x3.no1 + " " + no2);
	}
}
