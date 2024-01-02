package test1;
/*
 * 날짜 : 23/12/28
 * 이름 : 최이진
 * 내용 :자바 피보나치 수열 문제
 */
public class Test010 {
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1+", ");
		System.out.print(n2+", ");
		
		for(int i=1 ; i<=10 ; i++) {
			
			n3 = n1 + n2;
			
			System.out.print(n3 +", ");
			
			n1 = n2; //n2 값이 n1에 대입
			n2 = n3; //n3 값이 n2에 대입 -> for 문 처음으로 돌아가서 다시 n1(이전 n2 값) + n2(이전 n3 값) 
		}	
	}
}
