package ch20.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserInsertExample {
	public static void main(String[] args) {
		Connection conn = null;
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/chlvldzmf";
		String user = "chlvldzmf";
		String pass = "abc1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(host, user, pass);
			
			String sql = "INSERT INTO `user1` VALUES ('a101','김유신','98-08-15','010-1234-1111',23)";
			
			Statement stat = conn.createStatement();
			
			stat.executeUpdate(sql);
			
			stat.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
