package probono.service;

import java.util.ArrayList;

import lombok.extern.java.Log;
import probono.exception.NotExistException;
import probono.model.ProbonoModelVirtualDB;
import probono.model.dto.Activist;
import probono.model.dto.Probono;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

@Log
public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	private ProbonoModelVirtualDB projectVirtualData = ProbonoModelVirtualDB.getInstance();

	private ProbonoProjectService(){}
	public static ProbonoProjectService getInstance(){
		return instance;
	}

	
	
	//모든 Project 반환
	public ArrayList<ProbonoProject> getAllProjects() {
		return projectVirtualData.getProjectList();
	}

	public int getProjectListSize() {
		ArrayList<ProbonoProject> projectList = getAllProjects();
		return projectList.size();
	}
	
	//Project 검색
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
		ArrayList<ProbonoProject> projectList = getAllProjects();
		for(ProbonoProject p : projectList) {
			if(projectName.equals(p.getProbonoProjectName())) {
				project = p;
				break;
			}
		}
		return project;
	}
	
	//Project 추가
	public void projectInsert(ProbonoProject project) {
		projectVirtualData.insertProject(project);
		log.info("저장 성공");
	}
	
	//Project 수정 - 프로젝트 명으로 재능 기부자 수정
	public void projectUpdate(String projectName, Object obj) throws NotExistException{
		ProbonoProject project = getProbonoProject(projectName);
		if(project == null){
			throw new NotExistException("xxxxxxx 수정하고자 하는 Project가 미 존재합니다. xxxxxxx\n");
		} else if(obj instanceof Activist) {
			project.setActivist((Activist)obj);
			log.info("기부자 수정");
		} else if(obj instanceof Recipient) {
			project.setReceive((Recipient)obj);
			log.info("피 기부자 수정");
		} else if(obj instanceof Probono) {
			project.setProbono((Probono) obj);
			log.info("재능기부 정보 수정");
		} else if(obj instanceof String) {
			project.setProjectContent((String) obj); 
			log.info("재능기부 컨텐츠 수정");
		}

	}
	
	//Project 삭제
	public void projectDelete(String projectName) throws NotExistException{
		ProbonoProject project = getProbonoProject(projectName);
		
		ArrayList<ProbonoProject> projectList = getAllProjects();
	
		if(project == null) {
			throw new NotExistException("xxxxxxx 삭제하고자 하는 Project가 미 존재합니다. xxxxxxx\n");
		} else {
			for(int i = 0; i < getProjectListSize(); i++) {
				if(projectName.equals(projectList.get(i).getProbonoProjectName())) {
					projectList.remove(i);
					log.info("삭제 성공");
				}
			}
		}

	}
}