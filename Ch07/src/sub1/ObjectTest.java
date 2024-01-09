package sub1;
/*
 *  날짜 : 24/01/09
 *  이름 : 최이진
 *  내용 : java Object 클래스 실습
 *  
 */
public class ObjectTest {
	
	public static void main(String[] args) {
		
		Object a1 = new Apple("한국",3000);  //Object로 업캐스팅 가능
		Object a2 = new Apple("일본",2000);
		
		//toString 암시적으로 호출
		System.out.println(a1);
		System.out.println(a2);
		
		//객체 비교
		if(a1 == a2) {              //--------------------객체의 주소값 Stack 비교
			System.out.println("a1, a2의 주소 같다");
		}else {
			System.out.println("a1, a2의 주소 다르다");
		}
		if(a1.equals(a2)) {         //--------------------객체 내용 Heap 비교
			System.out.println("a1, a2의 객체 같다");
		}else {
			System.out.println("a1, a2의 객체 다르다");
		}
	}
}
