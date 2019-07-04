/*
 * crud�� ��� ��û�� �ް� ��û ó�� ���� �� ������� EndView���� ��� �����ϴ� ����
 * �ϳ��� �޼ҵ忡�� if �б⹮���� ���� ����
 * StartView.java���� Controller���� ��û��
 * �б⹮�� ���� �� �����ͷ� ��û
 * 1 - ��� �˻�, 2 ���� �˻�, 3 - ����(����), 4 - ����, 5 - ����
 */
package controller;

import model.PeopleModel;
import model.domain.People;
import view.EndView;

public class PeopleController {
	public static void request(int reqNomber) {
		if(reqNomber == 1) {
			
			EndView.printAll(PeopleModel.getAll());
			
		}else if(reqNomber == 2) {
			
		}else if(reqNomber == 3) {
			
			boolean r = PeopleModel.insert(new People("encoreMan", 20));	// encoreman����, 20 ����, People�� ����, insert��û
			if(r) {
				EndView.printSuccess("���Լ���");
			}else {
				EndView.printFail("���� ����");
			}
			
		}else if(reqNomber == 4) {
			PeopleModel.delete("encoreman");
		}else if(reqNomber == 5) {
			
		}else {
			EndView.printFail("��û�Ͻ� ������ ���� �� �� �����ϴ�.");
		}
	}
}
