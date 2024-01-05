package step3;

import java.util.Scanner;

public class Main3_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i =1; i<= N;i++) {
			for(int e = 1; e<=i; e++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
