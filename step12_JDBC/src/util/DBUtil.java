package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	//oracle driver가 이 소스들이 실행되는 시스템에 인스톨(로딩)
	//1단계 - driver 로딩
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		// 2단계 DB접속
	public static Connection getConnection() throws SQLException {
		// 													ip						id		pw
		return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "SCOTT", "TIGER");  //java language로 db와 소통할 땐 "jdbc:"로 시작
	}
	public static void close(Connection con, Statement stmt, ResultSet rset) {
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
	
	public static void close2(Connection con, Statement stmt) {
		try {						// rset, stmt, con 순의 순서 중요.
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
}
