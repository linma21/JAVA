package sub2;

import java.util.Scanner;

/*
 * 날짜 : 23/12/27
 * 이름 : 최이진
 * 내용 : 조건문 switch 실행
 */
public class SwitchTest {

	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		//사용자 입력
		Scanner scan = new Scanner(System.in);
	    int number = scan.nextInt();
	   
	    System.out.println(" 입력한 숫자 : " + number);
	   
	    scan.close();
	   
	    
		switch( number % 2 ) {
		case 0:
			System.out.println("number는 짝수입니다");
			break;
		case 1:
			System.out.println("number는 홀수입니다");
			break;
			
	
			
			
		} 
	}
}
