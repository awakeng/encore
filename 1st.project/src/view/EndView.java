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
		System.out.println("해당 학생의 평균 점수는: " + avg + "입니다.");
	}
//	public void printGetRankSuccess(int rank) {
//		System.out.println("해당 학생의 석차는: " + rank + "입니다.");
//	}
	public static void printFailure(String msg) {
		System.out.println(msg);
	}
	
	public static String loginSuccess() {
		return "안녕하세요";
	}
	public static String loginWarning() {
		return "관리자 계정으로 시도하세요";
	}
}
