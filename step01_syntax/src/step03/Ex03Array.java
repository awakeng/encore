/* �н� ����
 * 1. �迭
 * 	- �����͵��� �����
 *  - �ϳ��� ������ �ټ��� ������ ����
 *  - 1, 2, 3 ����� 3���� ������ �ʿ�. But �迭�� ����ϸ� �ϳ��� ������ 3���� ������ ����
 *  	: �����ʹ� 3�� �����ϴ� ������ �ϳ�. �̶� ������ ������ ������ index[����]
 * 2. Ư¡
 * 	1. �⺻Ÿ��, ����Ÿ�� ��� �迭ȭ ����
 * 	2. ��� �迭�� ������ ��ü		// ��ü ���� ������� �ʱ�ȭ ���� ���� ����������  ���� ���� // int [] i = new int[2];
 * 		- �ڹ� ��ü���� ����Ǵ� �޸� heap�� ����	// heap�� �����ߴ� => �ʱ�ȭ �ڵ����� ����
 * 		- ������� �ڵ� �ʱ�ȭó�� �迭�� �ʱ�ȭ
 * 	3. ������ �޸��� �������� ������ length ������ �ڵ� ���� // a[].length ??
 * 
 * 	cf)
 *  	- ���� ������ �ڵ� �ʱ�ȭ �Ұ�
 *  	- ����Ÿ��
 *  		1. API
 *  		2. ����� ���� Ÿ��(class�� interface)
 *  		3. �迭 - �⺻Ÿ��, ����Ÿ��
 *  
 */
package step03;

public class Ex03Array {
	//Student �� ���� ������ ������ ���� �Ŀ� ��ȯ
	
	//Array���� �н�
	//�⺻Ÿ�� -> ����Ÿ�� -> parameter -> ��ȯŸ��
	static int[] array1() {
		//����, ����, �ʱ�ȭ �и�
		int[] i = new int[2];	// ����, ��ü ����	// �迭�� class, interface���̵� ��ü ���� ����. �迭�� ��ü��. int[] �迭�̴�. int[]�� ��ü��
		i[0] = 10; // �ʱ�ȭ
		i[1] = 20;
		System.out.println(i[0] + " " + i.length);
		
		//����, ����, �ʱ�ȭ ���� �������� ó��
		int[] i2 = {30, 40};	// �̷��� �ص� �迭�� ������ ��ü��.
		System.out.println(i2[0] + " " + i.length);
		
		//int[] i3 = ArrayUtils.addAll(i, i2); // �� �迭 ��� ��ġ��?
		//
		return i2;
	}
	
	static void printArray(int[] i) {
		System.out.println(i[0] + " " + i.length);
	}
	//Array�� Student�� �����ؼ� ��ȯ
	public static void main(String[] args) {
		int[] v = array1();	// int[] 0 30, 40
		//length �������� ���������� �迭����.length�� ȣ���ؾ� ��
		
		System.out.println();
		
		for(int data : v) { // �����ڵ��� ������ �����Ͱ��� ���ؼ��� Ȱ��
			System.out.println(data);
		}
	}

}
/* int[] i2 = {30, 40}
 * i2��� ������ stack�� ����, �� ��� ���� ����
 * {30, 40}���� heap�� int[] �迭 ��ü ���� -> 0��° 30, 1��° 40, length 2
 * �Ϻ��� �迭 ��ü�� i2�� ����
 * 
 * i2�� stack�� ����, i2�� ����(��ü)Ÿ��, {30, 40}�� heap�� ����
 */
