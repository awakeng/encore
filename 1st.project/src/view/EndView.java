package view;

import model.domain.Student;

public class EndView {
	private static EndView instance;
	private EndView() {};
	
	static {
		System.out.println("Create an instance...");
		instance = new EndView();
	}
	
	public static EndView getInstance() {
		return instance;
	}
	
	public void printAll(Student[] all) {
		for(Student v : all) {
			if(v != null)
				System.out.println(v.toString());
		}
	}
	
}
