package ch20.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		
		// DB정보
				String host = "jdbc:mysql://127.0.0.1:3306/studydb";
				String user = "studydb";
				String pass = "abc1234";
				Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(host, user, pass);
			
			Statement stat = conn.createStatement();
			
			String sql = "SELCET * FROM `User1`";
			
			ResultSet rs = stat.executeQuery(sql);
			if(rs.next()) {
				User1 user1 = new User1();
				user1.setUid(rs.getString("uid"));
				user1.setName(rs.getString("name"));
				user1.setBirth(rs.getString("birth"));
				user1.setHp(rs.getString(4));
				user1.setAge(rs.getInt(5));
				System.out.println(user1);
			}else {
				System.out.println("사용자 아이디가 존재하지 않음");
			}
			rs.close();
			stat.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
