package view;

import controller.StudentController;

public class StartView {

	public static void main(String[] args) {
		// �˻�. ���� -> �˻�. ���� �Ǵ� ���� -> �˻�.
		StudentController.request(1);
		System.out.println("=========���� ��ü �˻�");
		StudentController.request(3);
		System.out.println("=========���̺� ���� �� ���� �˻�");
		StudentController.request(2);
		System.out.println("=========�赿�� ���� �� ��ü �˻�");
		StudentController.request(4);
		StudentController.request(1);
//		StudentController.request(6);
//		StudentController.request(7);
		System.out.println("=========���̺� ���� ���� �� ��ü �˻�");
		StudentController.request(5);
		StudentController.request(1);
	}

}