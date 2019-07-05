package controller;

import model.StudentModel;
import view.EndView;

public class StudentController {
	static EndView log = EndView.getInstance();
	
	public static void request(int rNo) {
		if(rNo == 1) {
			log.printAll(StudentModel.getAll());
		}
		else if(rNo == 2) {
			
		}else if(rNo == 3) {
			
		}else if(rNo == 4) {
			
		}else if(rNo == 5) {
			
		}
	}
}
