package probono.controller;

import java.util.ArrayList;

import net.sf.json.JSONArray;
import probono.exception.NotExistException;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.service.ProbonoProjectService;
import probono.view.EndView;
import probono.view.FailView;

public class ProbonoController {
	
	private static ProbonoController instance = new ProbonoController();
	private ProbonoProjectService service = ProbonoProjectService.getInstance();
	
	private ProbonoController() {}
	
	public static ProbonoController getInstance() {
		return instance;
	}
	
	
	//모든 프로젝트 검색
	public void projectListView() {
		ArrayList<ProbonoProject> projectList = service.getAllProjects();		
		if(projectList.size() != 0) {
			EndView.projectListView(projectList);	
		}else {
			EndView.messageView("진행중인 프로젝트는 존재하지 않습니다.");
		}
	}
	
	//json으로 변환 후 모든 프로젝트 검색
	public void jsonProjectListView() {
		ArrayList<ProbonoProject> projectList = service.getAllProjects();
		JSONArray jsonArray = JSONArray.fromObject(projectList);
		if(projectList.size() != 0) {
			EndView.jsonProjectListView(jsonArray);	
		}else {
			EndView.messageView("진행중인 프로젝트는 존재하지 않습니다.");
		}
	}
	
	//특정 프로젝트 검색
	public void projectView(String probonoName) {
		if(service.getProbonoProject(probonoName) != null) {
			EndView.projectView(service.getProbonoProject(probonoName));
		} else {
			EndView.messageView("검색 요청하신 프로젝트는 존재하지 않습니다.");
		}
	}
	
	//특정 프로젝트 검색 -json 타입
	public void jsonProjectView(String probonoName) {
		if(service.getProbonoProject(probonoName) != null) {
			JSONArray jsonArray = JSONArray.fromObject(service.getProbonoProject(probonoName));
			EndView.jsonProjectView(jsonArray);
		} else {
			EndView.messageView("검색 요청하신 프로젝트는 존재하지 않습니다.");
		}
	}
	
	//새로운 프로젝트 저장		
	public void insertProject(ProbonoProject newProject) {
		service.projectInsert(newProject);
	}
	
	
	//존재하는 프로젝트 수정					// 모든 필드값들 수정 가능하게 수정
	public void updateProject(String projectName, People people) {
		try {
			service.projectUpdate(projectName, people);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			//e.printStackTrace();
		}	
	}
	
	//모든 프로젝트 삭제
	public void deleteProject(String projectName) {
		try {
			service.projectDelete(projectName);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			//e.printStackTrace();
		}
	}
}










