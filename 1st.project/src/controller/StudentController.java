package controller;

import model.StudentModel;
import model.domain.Student;
import view.EndView;

public class StudentController {
	static StudentModel log = StudentModel.getInstance();
	
	public static void request(int rNo) {
		if(rNo == 1) {
			EndView.printAll(log.getAll());
		}
		else if(rNo == 2) {
			boolean result = log.one("���̺�");
			if(result) {
				EndView.printOneSuccess("�����ϴ� �̸��Դϴ�.");
			} else {
				EndView.printFailure("�������� �ʴ� �̸��Դϴ�.");
			}
		}else if(rNo == 3) {
			boolean result = log.insert(new Student("���̺�", 70, 70));
			if(result) {
				EndView.printInsertSuccess("���� ����");
			} else {
				EndView.printFailure("���� ����");
			}
		}else if(rNo == 4) {
			boolean result = log.delete("�赿��");
			if(result) {
				EndView.printDeleteSuccess("���� ����");
			} else {
				EndView.printFailure("���� ����");
			}
		}else if(rNo == 5) {
			boolean result = log.update("���̺�", 100, 100);
			if(result) {
				EndView.printUpdateSuccess("���� ����");
			} else {
				EndView.printFailure("���� ����");
			}
		}
		else if(rNo == 6) {	// ��� ���� �˻�
			float avg = log.getAvg("���̺�");
			if(log.getStudent("���̺�") != null) {
				EndView.printGetAvgSuccess(avg);
			} else {
				EndView.printFailure("�������� �ʴ� �̸��Դϴ�.");
			}
		}
//			else if(rNo == 7) {	// ���� �˻�
//			int rank = log.getRank("���̺�");
//			if(log.getStudent("���̺�") != null) {
//				EndView.printGetRankSuccess(rank);
//			} else {
//				EndView.printFailure("�������� �ʴ� �̸��Դϴ�.");
//			}
//		}
	}
}