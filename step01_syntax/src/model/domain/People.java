/* ����� ������ �����ϰ� �Ǵ� ����
 * ������ ����, �����ϴ� ���
 * ��, age�� �� �̻��� �����͸� ���: ��ȿ�� ����
 * *age ���� ����
 * 	1. �ܺο��� 32bit int(+ -)�� ������ �� 1 �̻��� �����͸� ���Եǰ� ���� 
 * 	2. age��� ������ ���� ȣ���ϸ� 32bit�� ��� ������ �� ���� �ޱ� ������ ���� ȣ�� ����
 * 		- private�� ����
 * 	3. ������ �޼ҵ�� ��ȿ�� ���� ���� �ݿ��ؼ� 1 �̻��� �����͸� ����
 * 		- public �߰� �޼ҵ� ����
 */
package model.domain;

public class People {
	private String name;
	private int age;
	public People() {}
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0)
			this.age = age;
		else
			System.out.println("���� ��ȿ�մϴ�.");
	}
//	//������
//	public People() {}
//	//��ü ���� ������ ����ڰ� ���ϴ� �����ͷ� ��ü�� ����鰪 ����(�ʱ�ȭ)
//	public People(String n, int a) {
//		name = n;
//		age = a;
//	}
	
	
	
	//name ������ ����, �����ϴ� 2���� �޼ҵ�
	
	//age ������ ����, �����ϴ� 2���� �޼ҵ�  // �ѱ� ���: 1�� �̻��� ����� �����͸� �Ͽ�:: ���ǽ� ����
	
}


