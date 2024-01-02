package test2;
/*
 *  날짜 : 23/12/29
 *  이름 : 최이진
 *  내용 : 자바 배열 문자 출력 문제
 */
public class Test2_1 {
	public static void main(String[] args) {
		
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E',' ','Y', 'o', 'U'};
		int row, col;
		
		for(row = 1; row < 10; row++) {
			
			for(col = 0; col <= row; col++) {
				
				System.out.print(str[col]);
				
			}
			System.out.print("\n");
		}
	}
}
