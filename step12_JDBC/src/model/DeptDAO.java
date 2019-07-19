package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptCopy;

public class DeptDAO {
	//oracle driver가 이 소스들이 실행되는 시스템에 인스톨(로딩)
	//1단계 - driver 로딩
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//모든 부서정부 검색 메소드
	/* select * from dept_copy;
	 * ArrayList에 부서 수만큼 DeptCopy 객체 생성해서 저장 후에 ArrayList 반환
	 */
	public static ArrayList<DeptCopy> getAllDept() {
		Connection con = null;
		Statement stmt = null;			//Stmt -> java.sql
		ResultSet rset = null;
		ArrayList<DeptCopy> allData = null;
		
		try {
			// 2단계 DB접속											ip						id		pw
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "SCOTT", "TIGER");  //java language로 db와 소통할 땐 "jdbc:"로 시작
			// 3단계 
			stmt = con.createStatement();											// sql 문장 실행 객체 -> stmt에 저장
			// 4단계
			rset = stmt.executeQuery("select * from dept_copy");					// sql 문장 실행	-> stmt 실행		"~" ~가 바로 Query!
			/* 1. 검색된 데이터 존재 여부 확인
			 * 	경우의 수 1: 데이터들이 있다.
			 * 	경우의 수 2: 데이터가 없다.
			 * 2. 경우의 수 1인 경우, 검색된 모든 데이터값을 이미 ResultSet이 보유하고 있는 상태
			 * 	- boolean next() 데이터 있니 없니 검사
			 * 	- getXxx(int column순서 or column명)
			 */
			allData = new ArrayList<DeptCopy>();			// performance를 고려한 위치 배정. 34~36 line에서 선언하면 해당 라인들에서 오류가 생겼을 시 AL이 생성되지 않고 넘어가기 때문에 단지 null값만 return되어 resource를 절약할 수 있다.
			while(rset.next()) {
				// 5단계
				allData.add(new DeptCopy(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {	// 6단계 자원 반환
			try {
				if(rset != null) {		// rset, stmt, con 순의 순서 중요.
					rset.close();
					rset = null;
				}
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(con != null) {
					con.close();	// 자원 반환
					con = null;
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return allData;
	}
	
	public static void main(String[] args) {
		ArrayList<DeptCopy> all = getAllDept();
		for(DeptCopy v : all) {
			System.out.println(v);
		}
	}
}
