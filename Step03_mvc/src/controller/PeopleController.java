/*
 * crud의 모든 요청을 받고 요청 처리 위임 및 결과값을 EndView에게 출력 위임하는 로직
 * 하나의 메소드에서 if 분기문으로 로직 구분
 * StartView.java에서 Controller에서 요청시
 * 분기문에 사용될 비교 데이터로 요청
 * 1 - 모든 검색, 2 개인 검색, 3 - 가입(저장), 4 - 삭제, 5 - 수정(name값 기준으로 age가 증가)
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
			
			boolean result = PeopleModel.pick("박현민");
			if(result) {
				EndView.printPickSuccess("입력하신 이름이 존재합니다.");
			}
			else {
				EndView.printFail("존재하지 않는 이름입니다.");
			}
			
		}else if(reqNomber == 3) {
			
			boolean r = PeopleModel.insert(new People("encoreMan", 20));	// encoreman생성, 20 생성, People로 결합, insert요청
			if(r) {
				EndView.printSuccess("가입성공");
			}else {
				EndView.printFail("가입 실패");
			}
			
		}else if(reqNomber == 4) {
			boolean result = PeopleModel.delete("encoreMan");
			if(result){
				EndView.printDeleteSuccess("삭제 성공");
			}else{
				EndView.printFail("삭제 실패");
			}			
		}
		
		else if(reqNomber == 5) {
			boolean result = PeopleModel.update("박현민", 20);
			if(result) {
				EndView.printUpdatesuccess("수정 성공");
			}
			else {
				EndView.printFail("수정 실패");
			}
		}
	}
}
