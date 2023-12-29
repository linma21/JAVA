package ch04.sec06;

import java.util.Scanner;

/*
 *  날짜 : 23/12/29
 *  이름 : 최이진
 *  내용 : p133
 */
public class DoWhileExam {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String input;
		
		do {
			System.out.print(">");
			input = scanner.nextLine();
			System.out.println(input);
			
		}while( ! input.equals("q")); 
		
		System.out.println();
		System.out.println("프로그램 종료");
	
		scanner.close();
	}

}
