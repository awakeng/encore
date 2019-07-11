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
		//제네릭 반영해서 ArrayList 저장 데이터 타입 제한
		ArrayList<String> al2 = new ArrayList<>();	// ArrayLsit<E> => E : 타입 제한
		al2.add("an");
		al2.add("b");
		al2.add("c");
		al2.add("d");
//		al2.add(new Customer()); 오류
		String v = al2.get(0);
		
		//wrapper class[autoboxing, unboxing]
		//기본값을 포장해서 객체화 하는 구조이기 때문에 wrapper
		/* 기본 8가지의 도우미 클래스 : java.lang package에 내장된 클래스들
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

/* ArrayList 객체 생성 - 메모리 생성
 * 저장 : public boolean add(Object obj){}
 * 반환, 삭제, 사이즈
 * 데이터 삭제를 요청하면, 요청받은 자료는 삭제되고 재정렬이 실행된다 ->> 동적 메소드의 특징
 */


