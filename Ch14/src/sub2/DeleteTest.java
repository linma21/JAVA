package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 24/01/22
 * 이름 : 최이진
 * 내용 : JDBC (Java DataBase Connectivity) 실습
 */
public class DeleteTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "studydb";
		String pass = "abc1234";
		
		try {
			// 1단계 - 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터 베이스 연결			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - Statement 생성
			Statement sttm = conn.createStatement();
			
			// 4단계 - SQL 문 전송
			String sql = "DELETE FROM `user1` WHERE `uid` ='J101';";
			
			sttm.executeUpdate(sql);
			
			// 5단계 - 결과 받기 (SELECT 경우)
			// 6단계 - 연결 해제
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("DELETE 완료 ...");
	}
}
