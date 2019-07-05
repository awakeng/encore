package model;

import model.domain.Student;

public class StudentModel {
	private static Student[] allData = new Student[10];
	private static int index;
	
	static {
		allData[0] = new Student("���̾�", 100, 100);
		allData[1] = new Student("���̵�", 90, 90);
		allData[2] = new Student("���̻级��", 80, 80);
		allData[3] = new Student("���̺�", 70, 70);
		index = 4;
	}
	
	//����
	public static boolean insert(Student v) {
		if(index < 5) {
			allData[index++] = v;
			return true;
		}else {
			return false;
		}
	}	
	//����
	public static boolean delete(String name) {		
		Student v = null;
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
	
	public static boolean update(String name, float midTerm, float finalTerm) {
		Student v = null;
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
	public static boolean pick(String name) {
		Student v = null;
		for(int i = 0; i < allData.length; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	//��� ����� �˻�
	public static Student[] getAll() {
		return allData;
	}
}
