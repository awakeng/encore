package view;

import model.domain.Student;

public class EndView {
	private static EndView instance;
	private EndView() {};
	
	static {
		System.out.println("Create an instance...");
		instance = new EndView();
	}
	
	public static EndView getInstance() {
		return instance;
	}
	
	public void printAll(Student[] all) {
		for(Student v : all) {
			if(v != null)
				System.out.println(v.toString());
		}
	}
	
	public void printSuccess(String msg) {
		System.out.println(msg);
	}
	public void printOneSuccess(String msg) {
		System.out.println(msg);
	}
	public void printInsertSuccess(String msg) {
		System.out.println(msg);
	}
	public void printDeleteSuccess(String msg) {
		System.out.println(msg);
	}
	public void printUpdateSuccess(String msg) {
		System.out.println(msg);
	}
//	public void printGetAvgSuccess(float avg) {
//		System.out.println("�ش� �л��� ��� ������: " + avg + "�Դϴ�.");
//	}
//	public void printGetRankSuccess(int rank) {
//		System.out.println("�ش� �л��� ������: " + rank + "�Դϴ�.");
//	}
	public void printFailure(String msg) {
		System.out.println(msg);
	}
	
	public String loginSuccess() {
		return "�ȳ��ϼ���";
	}
	public String loginWarning() {
		return "������ �������� �õ��ϼ���";
	}
}
