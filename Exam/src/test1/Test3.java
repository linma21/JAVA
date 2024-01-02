package test1;
/*
 * 날짜 : 23/12/28
 * 이름 : 최이진
 * 내용 :자바 연산자 문제
 */
public class Test3 {
	public static void main(String[] args) {
		
		int num = 1;
		int result;
				
		result = num++; //대입 후 증가 
		System.out.println("result1 : "+result);
		
		result = ++num; //증가 후 대입
		System.out.println("result2 : "+result);
		
		result = num--;
		System.out.println("result3 : "+result);
		
		result = --num;
		System.out.println("result4 : "+result);
		
		result = 2*num;
		System.out.println("result5 : "+result);
	}
}
