package ch04.sec05;
/*
 *  날짜 : 23/12/29
 *  이름 : 최이진
 *  내용 : p130
 */
public class SumFrom1To100Exam {
	public static void main(String[] args) {
		
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1~"+(i-1)+"합 :" +sum);		
	}
}
