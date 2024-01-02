package test1;

import java.util.Scanner;

/*
 * 날짜 : 23/12/28
 * 이름 : 최이진
 * 내용 :자바 기본 입출력 문제
 */
public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  year;
		int birth;
		String name;
		
		System.out.println("올해 년도 입력 : " );
		year = sc.nextInt(); //nestInt 는 숫자를 입력받을 수 있음
				
		System.out.println("태어난 년도 입력 : ");
		birth =sc.nextInt();
				
		System.out.println("이름 입력 : " );
		name = sc.next();
		
		int age = year - birth;		
				
		System.out.printf("%s 님 안녕하세요. \n당신은 올해 만 %d세 입니다.", name, age);
		
		sc.close();
	}
}
