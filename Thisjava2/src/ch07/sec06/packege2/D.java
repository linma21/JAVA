package ch07.sec06.packege2; // ----A와 다른 패키

import ch07.sec06.packege1.A;

public class D extends A{
	//생성자 선언
	public D() {
		//A생성자 호출
		super();             //O 상속을 통해서만 사용 가능
	}
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "value";//O
		//A 메소드 호출
		this.method();       //O
	}
	//메소드 선언
//	public void method2() {
//		A a = new A();       //X 직접 객체 생성하는 것은 안됨
//		a.field = "value";   //X
//		a.method();          //X
//	}
}
