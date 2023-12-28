package diy;
/*
 * 23/12/28
 * 혼자해보기
 */
import java.util.Scanner;

//점수 입력하면 등급나오게 만들기
public class A {
	public static void main(String[] args) {
		
		System.out.print("점수 입력: ");
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score>=90) {
			System.out.print("A등급 입니다.");
		}else if(score>=80) {
			System.out.println("B등급 입니다.");
		}else if(score>=70) {
			System.out.println("C등급 입니다.");
		}else if (score>=60) {
			System.out.println("D등급 입니다");
		}else {
			System.out.println("F등급 입니다.");
		}		
		scan.close();				
	}
}
