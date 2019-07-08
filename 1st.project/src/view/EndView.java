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
//		System.out.println("해당 학생의 평균 점수는: " + avg + "입니다.");
//	}
//	public void printGetRankSuccess(int rank) {
//		System.out.println("해당 학생의 석차는: " + rank + "입니다.");
//	}
	public void printFailure(String msg) {
		System.out.println(msg);
	}
	
	public String loginSuccess() {
		return "안녕하세요";
	}
	public String loginWarning() {
		return "관리자 계정으로 시도하세요";
	}
}
