package test2;
/*
 *  날짜 : 23/12/29
 *  이름 : 최이진
 *  내용 : 자바 피보나치 수열 재귀 메서드 연습
 */
public class Test2_10 {
	public static void main(String[] args) {
		
		for(int i= 0; i<10 ; i++) {
			
			int result = fibo(i);
			
			System.out.print(result +" ");
		}		
	}
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		return fibo(n-2)+ fibo(n-1);
	}
}
