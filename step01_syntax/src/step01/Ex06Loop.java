/* �н�����
 * 1. �ݺ��� �н�
 * 2. ����
 * 	1. for : �ݺ� Ƚ���� ��Ȯ�� ��� �ַ� ���
 * 		1. ����
 * 			for(���� ���� �� �ʱ�ȭ; ���ǽ�; ������ ����;){
 * 				���ǽ��� true�� ��� ����
 * 			} 
 * 		2. for Each
 * 
 * 2. while : �ݺ� Ƚ���� �Ҹ�Ȯ ���� ���� loop
 * 		1�� 2 : �ݺ� ������ true�� ��쿡�� ����
 * 
 * 		�ʱ��;
 * 		while(���ǽ�){
 * 			���ǽ��� true�� ��� ����
 * 			������;
 * 		}
 * 3. do~while : �ݺ� ���� �������� ������ �� �� ���� �� �ݺ� ���� ����
 * 		�ʱ��;
 * 		do{
 * 			���� ������ ������;
 * 		}while(���ǽ�);
 */
package step01;

public class Ex06Loop {
	//for	1	2	3	4	5
	static void forM() {
		for(int v=1; v<=5; v+=1) {
			System.out.print(v + "\t");
		}
		System.out.println();
	}
	//while
	static void whileM() {
		int i = 0;
		while(i < 5) {
			System.out.print(++i + "\t");
		}
		System.out.println();
	}
	//do~while
	static void doWhileM() {
		int i = 0;
		do {
			System.out.print(++i + "\t");
		}while(i<5);
		System.out.println();
	}
	public static void main(String[] args) {
		forM(); whileM(); doWhileM();
	}

}
