package model;

import model.domain.Student;

public class StudentModel {
	private static Student[] allData = new Student[10];
	private static int index;
	private Student v= null;
	
	private static StudentModel instance;
	
	static {
		System.out.println("Create an instance...");
		instance = new StudentModel();
		
		allData[0] = new Student("���̾�", 100, 100);
		allData[1] = new Student("���̵�", 90, 90);
		allData[2] = new Student("���̻级��", 80, 80);
		allData[3] = new Student("�赿��", 0, 0);
		index = 4;
	}
	
	public static StudentModel getInstance() {
		return instance;
	}
	
	//����
	public boolean insert(Student v) {
		if(index < 10) {
			allData[index++] = v;
			return true;
		}else {
			return false;
		}
	}	
	//����
	public boolean delete(String name) {		
		for(int i = 0; i < allData.length; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				allData[i] = null;
				return true;
			}
		}
		return false;
	}
	//����
	public boolean update(String name, float midTerm, float finalTerm) {
		for(int i = 0; i < allData.length; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				v.setSocre(midTerm, finalTerm);
				return true;
			}
		}
		return false;
	}
	//�� ��� ������ �˻�
	public boolean one(String name) {
		for(int i = 0; i < allData.length; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	//��� ����� �˻�
	public Student[] getAll() {
		return allData;
	}
	// �̸����� �Է��ϸ� �ش� �̸��� ������ �迭 �����͸� ��
	public Student getStudent(String name) {
		Student j= null;								
		for(Student v : allData) {
			if(v != null && v.getName().equals(name))
				j = v;	
		}
		return j;
	}
	//������� �˻�
	public float getAvg(String name) {
		return getStudent(name).getAvg();
	}
//	//���� �˻�
//	public int getRank(String name) {
//		int rank = 1;
//		for(Student v : allData) {
//			if(v != null && v.getAvg() > getStudent(name).getAvg())
//				rank++;
//		}
//		return rank;
//	}
	
}
