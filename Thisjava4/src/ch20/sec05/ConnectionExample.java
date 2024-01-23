package ch20.sec05;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		String host = "jdbc:mysql://127.0.0.1:3306/chlvldzmf";
		String user = "chlvldzmf";
		String pass = "abc1234";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(host, user, pass);
			
			System.out.println("연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!= null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
