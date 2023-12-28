package ch05;
/*
 * p.144
 * String 클래스의 주요 메서드
 */
public class Ex5_15StringClass {
	public static void main(String[] args) {
		String str ="ABCDE";
		
		// C 반환
		char ch = str.charAt(2);
		System.out.println(ch);
		//문자열 길이 반환
		int len = str.length();
		System.out.println(len);
		//문자열에서 해당 범위 반환 (to는 미포함)
		String sub = str.substring(0, 3); //0,1,2 반환
		System.out.println(sub);
		String sub1 = str.substring(1); //1,2····length() 끝까지 반환
		System.out.println(sub1);
		//		
	}
}
