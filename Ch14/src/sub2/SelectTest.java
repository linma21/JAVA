package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 24/01/22
 * 이름 : 최이진
 * 내용 : JDBC (Java DataBase Connectivity) 실습
 */

public class SelectTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "studydb";
		String pass = "abc1234";
		
		// 결과 처리용 리스트
		List<User1> users = new ArrayList<>();
		
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터 베이스 연결	
			Connection conn = DriverManager.getConnection(host, user, pass);
						
			// 3단계 - SQL 실행 객체 생성
			Statement stat = conn.createStatement();
						
			// 4단계 - SQL 문 전송
			String sql = "SELECT * FROM `user1`";
			ResultSet result = stat.executeQuery(sql);
						
			// 5단계 - 결과 받기 (SELECT 경우)
			while(result.next()) {
				
				String uid	 = result.getString(1);
				String name	 = result.getString(2);
				String birth = result.getString(3);
				String hp 	 = result.getString(4);
				int	   age	 = result.getInt(5);
				
				User1 u1 = new User1();
				u1.setUid(uid);
				u1.setName(name);
				u1.setBirth(birth);
				u1.setHp(hp);
				u1.setAge(age);
				
				users.add(u1);
				
				//System.out.printf("%s, %s, %s, %s, %d\n", uid,name,birth,hp,age);
			}
			
			// 6단계 - 연결 해제
			result.close();
			stat.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// SELECT 결과 List 출력
		for(User1 u1 : users) {
			
			System.out.printf("%s, %s, %s, %s, %d\n", u1.getUid(),
													  u1.getName(),
													  u1.getBirth(),
													  u1.getHp(),
													  u1.getAge());
		}
		
		System.out.println("SELECT 완료 ...");
	}

}
