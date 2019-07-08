package controller;

import model.StudentModel;
import model.domain.Student;
import view.EndView;

public class StudentController {
	static EndView log = EndView.getInstance();
	
	public static void request(int rNo) {
		if(rNo == 1) {
			log.printAll(StudentModel.getAll());
		}
		else if(rNo == 2) {
			boolean result = StudentModel.one("���̺�");
			if(result) {
				log.printOneSuccess("�����ϴ� �̸��Դϴ�.");
			} else {
				log.printFailure("�������� �ʴ� �̸��Դϴ�.");
			}
		}else if(rNo == 3) {
			boolean result = StudentModel.insert(new Student("���̺�", 70, 70));
			if(result) {
				log.printInsertSuccess("���� ����");
			} else {
				log.printFailure("���� ����");
			}
		}else if(rNo == 4) {
			boolean result = StudentModel.delete("�赿��");
			if(result) {
				log.printDeleteSuccess("���� ����");
			} else {
				log.printFailure("���� ����");
			}
		}else if(rNo == 5) {
			boolean result = StudentModel.update("���̺�", 100, 100);
			if(result) {
				log.printUpdateSuccess("���� ����");
			} else {
				log.printFailure("���� ����");
			}
		}
//		else if(rNo == 6) {	// ��� ���� �˻�
//			float avg = StudentModel.getAvg("���̺�");
//			if(StudentModel.getStudent("���̺�") != null) {
//				log.printGetAvgSuccess(avg);
//			} else {
//				log.printFailure("�������� �ʴ� �̸��Դϴ�.");
//			}
//		}else if(rNo == 7) {	// ���� �˻�
//			int rank = StudentModel.getRank("���̺�");
//			if(StudentModel.getStudent("���̺�") != null) {
//				log.printGetRankSuccess(rank);
//			} else {
//				log.printFailure("�������� �ʴ� �̸��Դϴ�.");
//			}
//		}
	}
}