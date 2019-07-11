package api;

import java.util.ArrayList;

import model.domain.Customer;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("string");
		al.add(new Customer("tester", "77", "vvip"));
		System.out.println(al); // index 1
		al.add("a");
		al.add("b");
		al.add("c");
//		System.out.println(al.size());
//		System.out.println(al);
//		System.out.println(al.get(1));
//		System.out.println(al.remove(0));
//		System.out.println(al.remove("a"));
//		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println("----------------------");
		//���׸� �ݿ��ؼ� ArrayList ���� ������ Ÿ�� ����
		ArrayList<String> al2 = new ArrayList<>();	// ArrayLsit<E> => E : Ÿ�� ����
		al2.add("an");
		al2.add("b");
		al2.add("c");
		al2.add("d");
//		al2.add(new Customer()); ����
		String v = al2.get(0);
		
		//wrapper class[autoboxing, unboxing]
		//�⺻���� �����ؼ� ��üȭ �ϴ� �����̱� ������ wrapper
		/* �⺻ 8������ ����� Ŭ���� : java.lang package�� ����� Ŭ������
		 * int : Integer
		 * byte : Byte
		 * 
		 */
		ArrayList<Integer> al3 = new ArrayList<>();
		al3.add(3); // al3.add(new Integer(3));
		al3.add(new Integer(10));
		int i3 = al3.get(1);	//( (Integer)al3.get(1)).intValue();
		System.out.println(al3);
	}

}

/* ArrayList ��ü ���� - �޸� ����
 * ���� : public boolean add(Object obj){}
 * ��ȯ, ����, ������
 * ������ ������ ��û�ϸ�, ��û���� �ڷ�� �����ǰ� �������� ����ȴ� ->> ���� �޼ҵ��� Ư¡
 */


