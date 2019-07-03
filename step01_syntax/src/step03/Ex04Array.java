package step03;

import model.domain.Student;  //ctrl + shift + o

public class Ex04Array {
	//Array ���� �н�
	//�迭 ����Ÿ��, parameter, ��ȯŸ�� ����
	
	static Student[] studentArray() {
		Student[] v = {new Student("�ſ��", 30), new Student("������", 25)};
		return v;
	}
	
	static void printStudentName(Student[] v) {
		for(Student data : v) {
			System.out.println(data.getName());
		}
	}
	
	/*
	 * ? printStudentName(Student[] v){}
	 * 1. �迭 ������ ��� �л����� �̸��鸸 ���
	 * 2. �������
	 * 		- name ������ �������� ���� �Ұ�: private
	 * 		- getName() ȣ�� ���� : public
	 * 3. ���� ����
	 * 		-for�� Ȱ�� �ʼ�
	 */
	public static void main(String[] args) {
		Student[] w = studentArray();
		for(Student data : w) {
			System.out.println(data);
		}
		
		printStudentName(w);
	}

}


/*	����
 *	1. ������ ����
 *		- DTO Ŭ���� ����
 *	2. �ش� DTO 3�� �̻��� �����͸� �迭�� ����
 *	3. �迭�� ����� ������ ������ ���
 *	4. ���� �� package��, class�� ����
 *	5. �������� - ������ �ڵ�� ����
 *		1. ���õ� ���� �ϼ�
 *		2. project��
 *			step01.apply
 *	6. ����
 *		- 7�� 4�� 9�� 5�б���
 *		- ���� ���� ���� 
 */
