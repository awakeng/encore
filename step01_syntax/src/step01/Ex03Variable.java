/* �н���ǥ
 * 1. ����
 * 	1-1. Ÿ��
 * 		a. �⺻
 * 			byte, short, int, long
 * 			float, double
 * 			char
 * 			boolean
 * 		b. ����
 * 			-  all types but primitives 
 * 	1-2. ���� ��ġ�� ���� ����
 * 		1. ���
 * 			- class {} ����
 * 		2. ����
 * 			- ������ �Ǵ� �޼ҵ��� parameter
 */

package step01;
import model.domain.People;; // Ÿ package���� import�ؿ��� class����� ctrl+space�� ��Ȯ�� ����ϱ�

public class Ex03Variable {

	public static void main(String[] args) {
		//People ��ü ���� - new People()
		People ppl = new People();
		//People�� "�� ¦ �̸�", ����(-) ����, setxxx(��)
		ppl.setName("���");
		ppl.setAge(-30);
		//People�� getXxx() ȣ���ؼ� ���
		System.out.println(ppl.getName()+", "+ppl.getAge());
		/*
		 * System
		 * out
		 * println ���
		 * p
		 * getName()
		 * +
		 * " "
		 * getAge()
		 * println ���� ����
		 * ; (����)
		 */
	}

}
