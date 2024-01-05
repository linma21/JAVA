package ch05.sec05;
//156
public class EqualExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동"; //JAVA는 문자열리터럴이 동일하다면 , 동일한 String 객체의 번지가 저장된다
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같음");
		}else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 문자열이 같음");
		}
		String str3 = new String("홍길동");
		String str4 = new String("홍길동"); //새로운 객체를 만드는 생성 연산자 -> 서로다른 번지를 가진다
		
		if(str3 == str4) {
			System.out.println("str1과 str2는 참조가 같음");
		}else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str1과 str2는 문자열이 같음"); //equals 는 번지수가 아니라 내부 문자열만을 비교한다
		}
			
	}

}
