package test2;
/*
 *  날짜 : 23/12/29
 *  이름 : 최이진
 *  내용 : 자바 배열 최대값 찾기 문제
 */
public class Test2_2 {
	public static void main(String[] args) {
		
		int arr[] = { 17, 92, 18, 33, 58, 7, 26, 42 };
		
		int maxNum = arr[0];
		
		for(int i = 0; i < 8; i++) {
			
			if(maxNum < arr[i]) {
				maxNum = arr[i];
				
			}
		}
		System.out.println("배열 arr에서 가장 큰 수 : "+maxNum);
	}
}
