package api;

import java.util.ArrayList;
import java.util.HashMap;

import model.domain.Customer;

public class HashMapTest {
	public static ArrayList<String> get1() {
		ArrayList<String> al2 = new ArrayList<>();//String만 저장 가능한 ArrayList
		al2.add("a");
		return al2;
	}
	public static ArrayList get2() {
		ArrayList<String> al2 = new ArrayList<>();//String만 저장 가능한 ArrayList
		al2.add("a");
		return al2;
	}
	
	public static void main(String[] args) {
		//ArrayList에 제네릭으로 <String>으로 제약을 주고, 이를 메소드 생성을 통하여 값을 받을 경우,
		//a. 메소드 타입, b. 반환 타입, c. 저장받는 변수의 타입 => 이 세가지 모두 <String>으로 제약을 받고 있어야 한다.
		
		ArrayList v11 = get2();
		String v21 = (String)v11.get(0);
		//String v211 = v11.get(0);  오류
		
		ArrayList<String> v31 = get2();	//메소드는 제약없이 반환 받았지만 저장을 <String>으로 해서 v41에 형변환 없이 들어갈 수 있었다.
		String v41 = v31.get(0);
		
		ArrayList v1 = get1();
		String v2 = (String)v1.get(0);
		
		ArrayList<String> v3 = get1();
		String v4 = v3.get(0);
		
		
		//key는 String타입, value도 String
		HashMap<String, String> m = new HashMap<>();
		//저장
		m.put("a", "data1");
		m.put("b", "data2");
		m.put("a", "data3");		//"a"의 value "data1" -> "data3" 업데이트
		System.out.println(m);
		
		System.out.println(m.get("a")); //data3
		m.remove("b"); //data2 삭제
		System.out.println(m.get("b"));//null
		
		//key는 String타입, value는 Customer
		//key는 Customer의 id로 합시다
		HashMap<String, Customer> m2 = new HashMap<>();
		m2.put("k1", new Customer("tester", "11", "vvip"));
		System.out.println(m2.get("k1").getGrade());
		
		ArrayList<String> al2 = new ArrayList<>();//String만 저장 가능한 ArrayList
		al2.add("a");
		al2.add("b");
		al2.add("c");
		al2.add("d");
		
		HashMap<String, ArrayList> m3 = new HashMap<>();
		m3.put("al2", al2);
		System.out.println(m3.get("al2").get(2));//c
		
		HashMap<String, HashMap> m4 = new HashMap<>();
		m4.put("m3", m3);
		System.out.println( ( (ArrayList) m4.get("m3").get("al2") ).get(2));
		
		HashMap<String, HashMap<String,ArrayList>> m5 = new HashMap<>();
		// m4와 일치하지만, m5의 value인 또 다른 HashMap m3의 타입지정을 다시 해줌으로써 형변환을 생략하게 됐다.
		m4.put("m3", m3);
		System.out.println( m5.get("m3").get("al2").get(2));
	}
}

/* 
 * 1. key value 매핑 구조로 데이터 관리하는 자료구조 학습
 * 2. java.util.Map interface를 구현하는 모든 클래스들은 key와 value 구조
 */


