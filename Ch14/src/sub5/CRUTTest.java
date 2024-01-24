package sub5;

import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 24/01/24
 * 이름 : 최이진
 * 내용: CRUT 실습
 * 
 */
public class CRUTTest {
	public static void main(String[] args) {
		System.out.println("회원관리매니저 v1.0");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.println("선택> ");
			
			int answer = sc.nextInt();
			UserDTO dto = new UserDTO();
			UserDAO dao = UserDAO.getInstance();
			
			if(answer == 0) {
				break;
				
			}else if(answer == 1) {
				// 입력
								
				System.out.print("아이디 입력 : ");
				String uid = sc.next();
				dto.setUid(uid);
				
				System.out.print("이름 입력 : ");
				String name = sc.next();
				dto.setName(name);
				
				System.out.print("생년월일 입력 : ");
				String birth = sc.next();
				dto.setBirth(birth);
				
				System.out.print("주소 입력 : ");
				String addr = sc.next();
				dto.setAddr(addr);
							
				dao.insertUser(dto);
				
				System.out.println("등록 완료...");
				
			}else if(answer == 2) {
				// 조회
				List<UserDTO> users = dao.selectUsers();
				
				for(UserDTO user : users) {
					System.out.println(user);
				}
				
			}else if(answer == 3) {
				// 검색
				System.out.println("아이디 검색 : ");
				String uid = sc.next();
				
				UserDTO user = dao.selectUser(uid);
				
				if(user == null) {
					System.out.println("해당하는 아이디를 가진 사용자가 없음");
				}else {
					System.out.println(user);
				}
				
			}else if(answer == 4) {
				// 수정
				System.out.print("수정 대상 아이디 입력 : ");
				String uid = sc.next();
				dto.setUid(uid);
				
				System.out.print("수정 회원 이름 입력 : ");
				String name = sc.next();
				dto.setName(name);
				
				System.out.print("수정 회원 생년월일 입력 : ");
				String birth = sc.next();
				dto.setBirth(birth);
				
				System.out.print("수정 회원 주소 입력 : ");
				String addr = sc.next();
				dto.setAddr(addr);
				
				dao.updateUser(dto);
				
				System.out.println("수정 완료 ...");
				
			}else if(answer == 5) {
				// 삭제
				System.out.println("삭제할 아이디 입력 : ");
				String uid = sc.next();
				
				dao.deleteUser(uid);
				
				System.out.println("삭제 완료 ...");
			}						
		}
		sc.close();
		System.out.println("회원관리매니저 종료...");
	}
}
