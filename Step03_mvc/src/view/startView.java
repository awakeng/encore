package view;

import controller.PeopleController;

public class startView {

	public static void main(String[] args) {
		/* 
		 * ����: ��� ������ �Ϻ��ϰ� �����Ǿ��� ����
		 * test�ϰ��� �ϴ� ���� ����
		 * 	- �˻�. ���� -> �˻�. ���� �Ǵ� ���� -> �˻�.
		 * 
		 * ���� : ���� */
		System.out.println("-- ���˻� --");
		PeopleController.request(1);
		PeopleController.request(3);
		System.out.println("-- ���� �� ��� �˻� --");
		PeopleController.request(1);
		PeopleController.request(4);
		System.out.println("-- ���� �� ��� �˻� --");
		PeopleController.request(1);
		PeopleController.request(2);
		PeopleController.request(5);
	}

}
