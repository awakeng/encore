package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	//oracle driver�� �� �ҽ����� ����Ǵ� �ý��ۿ� �ν���(�ε�)
	//1�ܰ� - driver �ε�
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		// 2�ܰ� DB����
	public static Connection getConnection() throws SQLException {
		// 													ip						id		pw
		return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "SCOTT", "TIGER");  //java language�� db�� ������ �� "jdbc:"�� ����
	}
	public static void close(Connection con, Statement stmt, ResultSet rset) {
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
	
	public static void close2(Connection con, Statement stmt) {
		try {						// rset, stmt, con ���� ���� �߿�.
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
}
