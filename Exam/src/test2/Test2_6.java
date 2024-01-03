package test2;
/*
 *  날짜 : 23/12/29
 *  이름 : 최이진
 *  내용 : 자바 메서드 연습문제
 */
import java.util.Scanner;

public class Test2_6 {
	public static void intro() {
		System.out.println("********* STRAT ***********");
		System.out.println("두개의 정수를 입력");
	}
	public static int input(Scanner sc, String name) {
		System.out.println("변수 "+name+"값 입력 : ");
		int input = sc.nextInt();
		return input;
	}
	public static void result(int val) {
		System.out.println("덧셈 결과 :"+val);
		System.out.println("********** END ************");
	}
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		intro();
		
		int a = input(sc, "a");
		int b = input(sc, "b");
		
		int output = add(a, b);
		result(output);
		
		sc.close();
	}
}