package sub02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 24/01/08
 * 이름 : 최이진
 * 내용 : 예외 던지기 실습하기
 */
public class ThrowsTest {
	
	public static void main(String[] args) {
		
		try {
		method1(10);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료 ...");
		
	}
	
	public static void method1(int n1) throws  Exception { //main에 예외 던지기
		method2(n1);
	}
	
    public static void method2(int n2) throws Exception { //method에 예외 던지기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		int input = sc.nextInt();  //input 에 0을 입력하는 경우, 문자를 입력하는 경우 에러 발생
		
		int result = n2 / input;  
		
		System.out.println("result : "+result);
	}
}
