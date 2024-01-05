package step3;

import java.util.Scanner;

public class Main3_10 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1;i<=N;i++) {
			
			for( int a =N-1;a>= i;a--) {
				System.out.print(" ");
			}			
				for(int b = 1; b<=i;b++) {
					System.out.print("*");
					
				}System.out.println();
			}
		}
}
