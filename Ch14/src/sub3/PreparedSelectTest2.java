package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 24/01/23
 * 이름 : 최이진
 * 내용 : PreparedStatement 실습
 */
public class PreparedSelectTest2 {
	public static void main(String[] args) {
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "studydb";
		String pass = "abc1234";
		List<User4VO> users = new ArrayList<User4VO>();
		
		try {
			// 1단계 - 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터 베이스 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL실행 객체 생성
			String sql = "SELECT * FROM `User2";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 4단계 - SQL 문 전송
			ResultSet rs = psmt.executeQuery();
			
			// 5단계 - 결과 받기 (SELECT 경우)
			
			
			while(rs.next()) {
			
			// 커서가 가리키는 튜플 결과 가져오기	
			String	 uid = rs.getString(1);
			String 	name = rs.getString(2);
			String gender = rs.getString(3);
			int		 age = rs.getInt(4);
			String 	hp = rs.getString(5);
			String	 addr = rs.getString(6);
			
			// VO 객체 생성 및 초기화
			User4VO user4 = new User4VO();
			user4.setUid(uid);
			user4.setName(name);
			user4.setGender(gender);
			user4.setAge(age);
			user4.setHp(hp);
			user4.setAddr(addr);
			
			users.add(user4);
			}
			
			// 6단계 - 연결 해제
			rs.close();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		// 결과 출력
		System.out.println("SELECT 성공 ...");
		
		
	}

}
