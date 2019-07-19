package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.DeptCopy;

public class DeptDAO {
	//oracle driver�� �� �ҽ����� ����Ǵ� �ý��ۿ� �ν���(�ε�)
	//1�ܰ� - driver �ε�
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//��� �μ����� �˻� �޼ҵ�
	/* select * from dept_copy;
	 * ArrayList�� �μ� ����ŭ DeptCopy ��ü �����ؼ� ���� �Ŀ� ArrayList ��ȯ
	 */
	public static ArrayList<DeptCopy> getAllDept() {
		Connection con = null;
		Statement stmt = null;			//Stmt -> java.sql
		ResultSet rset = null;
		ArrayList<DeptCopy> allData = null;
		
		try {
			// 2�ܰ� DB����											ip						id		pw
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "SCOTT", "TIGER");  //java language�� db�� ������ �� "jdbc:"�� ����
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
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {	// 6�ܰ� �ڿ� ��ȯ
			try {
				if(rset != null) {		// rset, stmt, con ���� ���� �߿�.
					rset.close();
					rset = null;
				}
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(con != null) {
					con.close();	// �ڿ� ��ȯ
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
