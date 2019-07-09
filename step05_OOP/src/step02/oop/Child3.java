package step02.oop;

class Parent3 extends Object{
	String name;
	int age;
	
	Parent3(){
		super();			// 반드시 첫 라인에 와야 함.
	}
	
	void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
}


public class Child3 extends Parent3{
	String job;

	public Child3() {
		super();
	}
	
	void printAll() {	//virtual method invocation
		super.printAll();
		System.out.println(job);

	}
	//다형성 적용된 메소드
	static Object m() {
		return "string";
	}
	static Object m2() {
		return "string,int,double,boolean";
	}
	
	public static void main(String[] args) {
		Parent3 p = new Child3();
		p.printAll();
		
//		System.out.println(((String)m()).charAt(5));
		
		//?m2() 반환값을 ","를 기준으로(구분자) 하나의 배열에 4개의 데이터가 저장되는 구조로 변환
		/* 작업단계
		 * 메소드의 반환값 받음 -> String 변환 -> 배열로 변환
		 * 
		 * charAt(), length(), split()
		 * ? split()로 구분된 문자열들을 char[] 생성
		 * 첫 번째 index에 저장된 string이라는 문자열을 char[]에 저장
		 */
		
		String[] all = ((String)m2()).split(",");
		char[] all2 = new char[all[0].length()];
//		int size = all2.length; 	// 배열의 길이를 size에 저장해 줌으로써,
									// 배열의 데이터 용량이 거대해졌을 때 반복문 내에서 매번 배열을 읽게하는 과정(배열의 크기를 알기 위해)을 생략해 줄 수 있다.		
		for(int i = 0; i<all2.length; i++) {
			all2[i] = all[0].charAt(i);
			System.out.print(all2[i] + "\t");
		}
	}

}
