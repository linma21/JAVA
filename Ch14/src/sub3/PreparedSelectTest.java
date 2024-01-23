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
 * 
 * PreparedStatement 
 * 	- 기존 Statement 보다 향상되 동적 SQL 생성을 위한 Statement
 * 	- Query Parameters 를 이용하여 값을 Mapping(사상, 바인딩) 해서 쿼리 실행
 * 
 * VO 객체
 * 	- VO(Value Object) 객체는 SELECT 결과 테이블 속성을 갖는 객체
 * 	- 테이블 개체(Entity)를 객체(Object)로 변환할 때 사용되는 객체
 * 	- JSP, Spring 에서는 DTO(Data Transfer Object) 로 사용
 */
public class PreparedSelectTest {
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
			String sql = "SELECT * FROM `User4`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 4단계 - SQL 문 전송
			ResultSet rs = psmt.executeQuery();
			
			// 5단계 - 결과 받기 (SELECT 경우)
			
			
			while(rs.next()) {
				// VO 객체 생성 및 초기화
				User4VO VO = new User4VO();
				VO.setUid(rs.getString("uid"));
				VO.setName(rs.getString("name"));
				VO.setGender(rs.getString("gender"));
				VO.setAge(rs.getInt("age"));
				VO.setHp(rs.getString("hp"));
				VO.setAddr(rs.getString("addr"));
			
				// 리스트 추가
			users.add(VO);
			
			}
			
			// 6단계 - 연결 해제
			rs.close();
			psmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		// 결과 출력
		
		
		for(User4VO vo : users) {
			System.out.printf("%s,%s,%s,%d,%s,%s\n", vo.getUid(),
													vo.getName(),
													vo.getGender(),
													vo.getAge(),
													vo.getHp(),
													vo.getAddr());
		}
		System.out.println("SELECT 성공 ...");
	}
}
