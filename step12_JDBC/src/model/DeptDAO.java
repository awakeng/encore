package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptCopy;
import util.DBUtil;

public class DeptDAO {

	
	//모든 부서정부 검색 메소드
	/* select * from dept_copy;
	 * ArrayList에 부서 수만큼 DeptCopy 객체 생성해서 저장 후에 ArrayList 반환
	 */
	public static ArrayList<DeptCopy> getAllDept() throws SQLException {
		Connection con = null;
		Statement stmt = null;			//Stmt -> java.sql
		ResultSet rset = null;
		ArrayList<DeptCopy> allData = null;
		
		try {
			// 2단계 DB접속											ip						id		pw
			con = DBUtil.getConnection();
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
		}finally {	// 6단계 자원 반환
			DBUtil.close(con, stmt, rset);
		}
		return allData;
	}
	
	public static DeptCopy getDept(int dept) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		DeptCopy deptData = null;
		
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rset = stmt.executeQuery("select * from dept_copy where deptno =" + dept);
			
			if(rset.next()) {
				deptData = new DeptCopy(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc"));
			}
		} finally {
			DBUtil.close(con, stmt, rset);
		}
		return deptData;
	}
	
	public static boolean insertEmp01(DeptCopy dept) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into dept_copy values(?, ?, ?)");
			
			//데이터 반영
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			int r = pstmt.executeUpdate();
			if(r != 0) {
				return true;
			}
		} finally {
			DBUtil.close2(con, pstmt);
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		try {
			insertEmp01(new DeptCopy(70, "hr", "서초"));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ArrayList<DeptCopy> all;
		try {
			all = getAllDept();
			for(DeptCopy v : all) {
				System.out.println(v);
			}
			DeptCopy dept = getDept(10);
			System.out.println(dept);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
