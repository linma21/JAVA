package sub04;
/*
 *  날짜 : 23/12/29
 *  이름 : 최이진
 *  내용 : 메서드 오버로드 실습하기
 *  
 *  메서드 오버로드
 *   - 같은 이름의 메서드를 매개변수로 구분한 메서드
 *   - 매개변수 갯수, 타입으로 구분
 *   - 변환타입은 메서드 오버로드로 지원 안됨
 *  
 */
public class MethodOverloadTest {
	public static void main(String[] args) {
		
		int r1= add(3);
		int r2= add(1,2);
		double r3= add(1.1,2.1);
		String r4= add("Hello,"," World");
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
	}
	
	//메서드 오버로딩
	public static int add(int a) {
		return a + a;
	}
	public static int add(int a,int b) { //매개변수 갯수가 다름
		return a + b;
	}
	public static double add(double a,double b) { //매개변수 타입이 다름
		return a + b;
	}
	public static String add(String a,String b) { //"String" + "String" 문자열을 연결해주는 + 는 concat
		return a + b;
	}

}
