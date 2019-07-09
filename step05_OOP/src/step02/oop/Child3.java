package step02.oop;

class Parent3 extends Object{
	String name;
	int age;
	
	Parent3(){
		super();			// �ݵ�� ù ���ο� �;� ��.
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
	//������ ����� �޼ҵ�
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
		
		//?m2() ��ȯ���� ","�� ��������(������) �ϳ��� �迭�� 4���� �����Ͱ� ����Ǵ� ������ ��ȯ
		/* �۾��ܰ�
		 * �޼ҵ��� ��ȯ�� ���� -> String ��ȯ -> �迭�� ��ȯ
		 * 
		 * charAt(), length(), split()
		 * ? split()�� ���е� ���ڿ����� char[] ����
		 * ù ��° index�� ����� string�̶�� ���ڿ��� char[]�� ����
		 */
		
		String[] all = ((String)m2()).split(",");
		char[] all2 = new char[all[0].length()];
//		int size = all2.length; 	// �迭�� ���̸� size�� ������ �����ν�,
									// �迭�� ������ �뷮�� �Ŵ������� �� �ݺ��� ������ �Ź� �迭�� �а��ϴ� ����(�迭�� ũ�⸦ �˱� ����)�� ������ �� �� �ִ�.		
		for(int i = 0; i<all2.length; i++) {
			all2[i] = all[0].charAt(i);
			System.out.print(all2[i] + "\t");
		}
	}

}
