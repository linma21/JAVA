package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 24/01/23
 * 이름 : 최이진
 * 내용 : PreparedStatement 실습
 */
public class PreparedDeleteTest {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "studydb";
		String pass = "abc1234";
		try {
			// 1단계 - 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터 베이스 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
						
			// 3단계 - SQL실행 객체 생성 및 맵핑
			String sql ="DELETE FROM `User1` WHERE `uid` =?";
			PreparedStatement psmt = conn.prepareStatement(sql);			
			psmt.setString(1, "B101");
			
			// 4단계 - SQL 문 전송
			psmt.executeUpdate();
			
			// 5단계 - 결과 받기 (SELECT 경우)
			// 6단계 - 연결 해제
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("DELETE 성공 ...");
	}

}
