package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptCopy;
import util.DBUtil;

public class DeptDAO {

	
	//��� �μ����� �˻� �޼ҵ�
	/* select * from dept_copy;
	 * ArrayList�� �μ� ����ŭ DeptCopy ��ü �����ؼ� ���� �Ŀ� ArrayList ��ȯ
	 */
	public static ArrayList<DeptCopy> getAllDept() throws SQLException {
		Connection con = null;
		Statement stmt = null;			//Stmt -> java.sql
		ResultSet rset = null;
		ArrayList<DeptCopy> allData = null;
		
		try {
			// 2�ܰ� DB����											ip						id		pw
			con = DBUtil.getConnection();
			// 3�ܰ� 
			stmt = con.createStatement();											// sql ���� ���� ��ü -> stmt�� ����
			// 4�ܰ�
			rset = stmt.executeQuery("select * from dept_copy");					// sql ���� ����	-> stmt ����		"~" ~�� �ٷ� Query!
			/* 1. �˻��� ������ ���� ���� Ȯ��
			 * 	����� �� 1: �����͵��� �ִ�.
			 * 	����� �� 2: �����Ͱ� ����.
			 * 2. ����� �� 1�� ���, �˻��� ��� �����Ͱ��� �̹� ResultSet�� �����ϰ� �ִ� ����
			 * 	- boolean next() ������ �ִ� ���� �˻�
			 * 	- getXxx(int column���� or column��)
			 */
			allData = new ArrayList<DeptCopy>();			// performance�� ����� ��ġ ����. 34~36 line���� �����ϸ� �ش� ���ε鿡�� ������ ������ �� AL�� �������� �ʰ� �Ѿ�� ������ ���� null���� return�Ǿ� resource�� ������ �� �ִ�.
			while(rset.next()) {
				// 5�ܰ�
				allData.add(new DeptCopy(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
			}
		}finally {	// 6�ܰ� �ڿ� ��ȯ
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
	
	public static void main(String[] args) {
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
