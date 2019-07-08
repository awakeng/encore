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
			boolean result = log.one("정이본");
			if(result) {
				EndView.printOneSuccess("존재하는 이름입니다.");
			} else {
				EndView.printFailure("존재하지 않는 이름입니다.");
			}
		}else if(rNo == 3) {
			boolean result = log.insert(new Student("정이본", 70, 70));
			if(result) {
				EndView.printInsertSuccess("생성 성공");
			} else {
				EndView.printFailure("생성 실패");
			}
		}else if(rNo == 4) {
			boolean result = log.delete("김동성");
			if(result) {
				EndView.printDeleteSuccess("삭제 성공");
			} else {
				EndView.printFailure("삭제 실패");
			}
		}else if(rNo == 5) {
			boolean result = log.update("정이본", 100, 100);
			if(result) {
				EndView.printUpdateSuccess("수정 성공");
			} else {
				EndView.printFailure("수정 실패");
			}
		}
		else if(rNo == 6) {	// 평균 점수 검색
			float avg = log.getAvg("정이본");
			if(log.getStudent("정이본") != null) {
				EndView.printGetAvgSuccess(avg);
			} else {
				EndView.printFailure("존재하지 않는 이름입니다.");
			}
		}
//			else if(rNo == 7) {	// 석차 검색
//			int rank = log.getRank("정이본");
//			if(log.getStudent("정이본") != null) {
//				EndView.printGetRankSuccess(rank);
//			} else {
//				EndView.printFailure("존재하지 않는 이름입니다.");
//			}
//		}
	}
}