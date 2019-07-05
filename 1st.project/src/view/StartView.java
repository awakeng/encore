package view;

import controller.StudentController;

public class StartView {

	public static void main(String[] args) {
		// 검색. 저장 -> 검색. 수정 또는 삭제 -> 검색.
		StudentController.request(1);
	}

}
