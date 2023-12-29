package test1;

import java.util.Scanner;

/*
 * 날짜 : 23/12/28
 * 이름 : 최이진
 * 내용 : 자바 문제
 */
public class Test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 :");
		int score = sc.nextInt();
		char grade; //문자 대입 char   
		
		System.out.println("입력한 점수는 " + score+"입니다.");
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80 && score < 90) { //if else 인데 &&굳이 써야하나요?
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.printf("등급은 %c입니다.", grade);
		
		sc.close();
		}
}
