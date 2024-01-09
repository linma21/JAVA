package ch07.sec06.packege1; // ----A와 같은 패키지

public class B {
	//메소드 선언
	public void method() {
		A a = new A();       //O
		a.field = "value";   //O
		a.method();          //O
	}
}
