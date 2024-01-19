package test2_2;

public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			int result = fibo(i);
			System.out.print(result+" ");
		}
	}
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		return fibo(n-2)+ fibo(n-1);
	}
}
