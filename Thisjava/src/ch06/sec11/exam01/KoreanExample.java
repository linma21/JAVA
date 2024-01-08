package ch06.sec11.exam01;
//254
public class KoreanExample {
	public static void main(String[] args) {
		
	Korean k1 = new Korean("123456-1234567", "감자바");
	
	//필드값 읽기
	System.out.println(k1.nation);
	System.out.println(k1.name);
	System.out.println(k1.ssn);
	
	//final 필드 값은 변경할 수 없음
	//k1.nation = "USA";
	//k1.ssn = "123-123-124";
	
	//비 final 값은 변경 가능
	k1.name = "김자바";
	}
}
