package sub3;
/*
 *  날짜 : 24/01/09
 *  이름 : 최이진
 *  내용 : java String Builder 클래스 실습
 *  
 */
public class StringBuliderTest {
	
	public static void main(String[] args) {
				
		//String immutable (불변성)
		String str = "Hello";
		System.out.println("str 객체 주소 : "+System.identityHashCode(str));
		
		str += "World";
		System.out.println("str 객체 주소 : "+System.identityHashCode(str));
		
		System.out.println("str : "+str);
		
		//String immutable 단점을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb 객체 주소 : "+System.identityHashCode(sb));
		
		sb.append("World");
		System.out.println("sb 객체 주소 : "+System.identityHashCode(sb));
		System.out.println("sb : "+sb);
	}
}
