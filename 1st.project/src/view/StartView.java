package view;

import controller.StudentController;

public class StartView {

	public static void main(String[] args) {
		// 검색. 저장 -> 검색. 수정 또는 삭제 -> 검색.
		StudentController.request(1);
		System.out.println("=========최초 전체 검색");
		StudentController.request(3);
		System.out.println("=========정이본 생성 후 개인 검색");
		StudentController.request(2);
		System.out.println("=========김동성 삭제 후 전체 검색");
		StudentController.request(4);
		StudentController.request(1);
//		StudentController.request(6);
//		StudentController.request(7);
		System.out.println("=========정이본 성적 수정 후 전체 검색");
		StudentController.request(5);
		StudentController.request(1);
	}

}