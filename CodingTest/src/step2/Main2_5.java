package step2;

import java.util.Scanner;

public class Main2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M>=45) {
			System.out.print(H);
			System.out.print(" "+(M-45));
		}else if(M<45 && H > 1) {
			System.out.print(H-1);
			System.out.print(" "+(M+15));
		}else {
			System.out.print(H+23);
			System.out.print(" "+(M+15));
			
		}			
	}
}
