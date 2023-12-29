package step2;

import java.util.Scanner;

public class Main2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int total = A*60 +B + C;
		
		int Time = total / 60;
		int Min = total % 60;
		
		if(Time >= 24 ) {
		System.out.println((Time-24)+" "+Min);		
	}else {
		System.out.println(Time+" "+Min);
	}		
}
}
