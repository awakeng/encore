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
			boolean result = StudentModel.one("정이본");
			if(result) {
				log.printOneSuccess("존재하는 이름입니다.");
			} else {
				log.printFailure("존재하지 않는 이름입니다.");
			}
		}else if(rNo == 3) {
			boolean result = StudentModel.insert(new Student("정이본", 70, 70));
			if(result) {
				log.printInsertSuccess("생성 성공");
			} else {
				log.printFailure("생성 실패");
			}
		}else if(rNo == 4) {
			boolean result = StudentModel.delete("김동성");
			if(result) {
				log.printDeleteSuccess("삭제 성공");
			} else {
				log.printFailure("삭제 실패");
			}
		}else if(rNo == 5) {
			boolean result = StudentModel.update("정이본", 100, 100);
			if(result) {
				log.printUpdateSuccess("수정 성공");
			} else {
				log.printFailure("수정 실패");
			}
		}
//		else if(rNo == 6) {	// 평균 점수 검색
//			float avg = StudentModel.getAvg("정이본");
//			if(StudentModel.getStudent("정이본") != null) {
//				log.printGetAvgSuccess(avg);
//			} else {
//				log.printFailure("존재하지 않는 이름입니다.");
//			}
//		}else if(rNo == 7) {	// 석차 검색
//			int rank = StudentModel.getRank("정이본");
//			if(StudentModel.getStudent("정이본") != null) {
//				log.printGetRankSuccess(rank);
//			} else {
//				log.printFailure("존재하지 않는 이름입니다.");
//			}
//		}
	}
}