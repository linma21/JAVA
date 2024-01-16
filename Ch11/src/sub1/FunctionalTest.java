package sub1;
/*
 * 날짜 : 24/01/11
 * 이름 : 최이진
 * 내용 : 함수형 프로그래밍 실습
 * 
 * 함수형 프로그래밍
 *   - 프로그래밍 단위를 함수(메서드) 위주로 프로그래밍하는 패러다임
 *   - 함수형 프로그래밍을 람다식으로 구현
 */

interface A{
	public void Hello();
}

class B implements A {

	@Override
	public void Hello() {
		System.out.println("Hello World");		
	}	
}
public class FunctionalTest {
	public static void main(String[] args) {
		
	     // 객체지향 프로그래밍
		A a1 = new B();
		a1.Hello();
		
		// 익명 객체 (인터페이스를 바로 객체 생성)
		A a2 = new A() {
			
			@Override
			public void Hello() {
				System.out.println("Hello World");	
			}
		};
		a2.Hello();
		
		// 함수형 프로그램
		A a3 = () -> {System.out.println("Hello Wolrd...");};
		//반드시 인터페이스
		
		a3.Hello();    		
	}
}
