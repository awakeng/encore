package view;

import model.domain.Student;

public class EndView {
	private EndView() {};
	
	public static void printAll(Student[] all) {
		for(Student v : all) {
			if(v != null)
				System.out.println(v.toString());
		}
	}
	
	public static void printSuccess(String msg) {
		System.out.println(msg);
	}
	public static void printOneSuccess(String msg) {
		System.out.println(msg);
	}
	public static void printInsertSuccess(String msg) {
		System.out.println(msg);
	}
	public static void printDeleteSuccess(String msg) {
		System.out.println(msg);
	}
	public static void printUpdateSuccess(String msg) {
		System.out.println(msg);
	}
	public static void printGetAvgSuccess(float avg) {
		System.out.println("�ش� �л��� ��� ������: " + avg + "�Դϴ�.");
	}
//	public void printGetRankSuccess(int rank) {
//		System.out.println("�ش� �л��� ������: " + rank + "�Դϴ�.");
//	}
	public static void printFailure(String msg) {
		System.out.println(msg);
	}
	
	public static String loginSuccess() {
		return "�ȳ��ϼ���";
	}
	public static String loginWarning() {
		return "������ �������� �õ��ϼ���";
	}
}
