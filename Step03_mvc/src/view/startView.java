package view;

import controller.PeopleController;

public class startView {

	public static void main(String[] args) {
		/* 
		 * 가정: 모든 로직이 완벽하게 구현되었다 가정
		 * test하고자 하는 실행 순서
		 * 	- 검색. 저장 -> 검색. 수정 또는 삭제 -> 검색.
		 * 
		 * 현실 : 가입 */
		System.out.println("-- 모든검색 --");
		PeopleController.request(1);
		PeopleController.request(3);
		System.out.println("-- 저장 후 모든 검색 --");
		PeopleController.request(1);
		PeopleController.request(4);
		System.out.println("-- 삭제 후 모든 검색 --");
		PeopleController.request(1);
		PeopleController.request(2);
		PeopleController.request(5);
	}

}
