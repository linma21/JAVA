package sub04;
/*
 *  날짜 : 23/12/29
 *  이름 : 최이진
 *  내용 : 메서드 오버로딩 연습하기
 */
public class MethodOverload22 {
	public static void main(String[] args) {
		
		int i = add(2,3);
		System.out.println(i);
		
		String s = str("Hello");
		System.out.print(s);
		
		String b = add("World");
		System.out.println(b);
	}
	
	public static int add(int a, int b) {
		
		int i = a * (b + 1);
		
		return i;
		
	}
	public static String str(String s){
	
	return s;
	
	}
	public static String add(String b) { 
		return b;
	}
}
