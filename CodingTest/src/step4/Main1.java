package step4;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 0;
		
		int[] arr = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			int A = sc.nextInt();
		  arr[i] = A;
	  }
		int B =sc.nextInt();
		
		for(int k = 0; k < N ; k++) {
		  
		  if(arr[k] == B) {
			  count++;
		  }
	  }System.out.println(count);

}		  
}		
		

