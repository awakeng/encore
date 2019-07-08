package model;

import model.domain.Student;

public class StudentModel {
	private static Student[] allData = new Student[10];
	private static int index;
	
	static {
		allData[0] = new Student("정이안", 100, 100);
		allData[1] = new Student("정이든", 90, 90);
		allData[2] = new Student("정이사벨라", 80, 80);
		allData[3] = new Student("김동성", 0, 0);
		index = 4;
	}
	
	//생성
	public static boolean insert(Student v) {
		if(index < 10) {
			allData[index++] = v;
			return true;
		}else {
			return false;
		}
	}	
	//삭제
	public static boolean delete(String name) {		
		Student v = null;
		for(int i = 0; i < allData.length; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				allData[i] = null;
				return true;
			}
		}
		return false;
	}
	//수정
	public static boolean update(String name, float midTerm, float finalTerm) {
		Student v = null;
		for(int i = 0; i < allData.length; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				v.setSocre(midTerm, finalTerm);
				return true;
			}
		}
		return false;
	}
	//한 사람 정보만 검색
	public static boolean one(String name) {
		Student v = null;
		for(int i = 0; i < allData.length; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	//모든 사람들 검색
	public static Student[] getAll() {
		return allData;
	}
//	// 이름값을 입력하면 해당 이름을 포함한 배열 데이터를 줌
//	public static Student getStudent(String name) {
//		Student j= null;								
//		for(Student v : allData) {
//			if(v != null && v.getName().equals(name))
//				j = v;	
//		}
//		return j;
//	}
//	//평균점수 검색
//	public static float getAvg(String name) {
//		return getStudent(name).getAvg();
//	}
//	//석차 검색
//	public static int getRank(String name) {
//		int rank = 1;
//		for(Student v : allData) {
//			if(v != null && v.getAvg() > getStudent(name).getAvg())
//				rank++;
//		}
//		return rank;
//	}
}
