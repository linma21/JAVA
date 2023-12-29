package diy;

import java.util.Scanner;
/*
 * 23/12/28
 * 혼자해보기
 * switch로 등급 정리 해보기
 */
public class C {
	public static void main(String[] args) {
		
		System.out.println("점수 입력 :");
				
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		switch(score /= 10) {
		case 9, 10 :
			System.out.println("A등급 입니다.");
			break;
		case 8 :
			System.out.println("B등급 입니다.");
			break;
		case 7 :
			System.out.println("C등급 입니다.");
			break;
		case 6 :
			System.out.println("D등급 입니다.");
			break;
		case 5 :
			System.out.println("E등급 입니다.");
			break;
		default:
			System.out.println("F등급 입니다.");			
		}
		scan.close();				
	}
}
