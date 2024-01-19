package test1_1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.println("올해 년도: ");
		year = sc.nextInt();
		System.out.println("탄생 년도: ");
		birth = sc.nextInt();
		System.out.println("이릅 입력: ");
		name = sc.nextLine();
		
		int age = year - birth;
		
		System.out.printf("%s님 안녕하세요. \n당신은 올해 %d세 입니다",name,age);
		
		sc.close();
	}	
}
