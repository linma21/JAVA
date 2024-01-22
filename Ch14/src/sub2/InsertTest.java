package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 24/01/22
 * 이름 : 최이진
 * 내용 : JDBC (Java DataBase Connectivity) 실습
 */
public class InsertTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "studydb";
		String pass = "abc1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
						
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String spl = "INSERT INTO `User1` VALUES ('J101','김유신','95-12-12','010-1234-1112','27')";
			
			stmt.executeUpdate(spl);
						
			// 5단계 - 결과 처리(SELECT 경우)
			
			
			// 6단계 - 접속 종료
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("INSERT 완료 ...");
	}
}
