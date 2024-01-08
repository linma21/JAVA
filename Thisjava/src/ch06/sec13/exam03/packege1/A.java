package ch06.sec13.exam03.packege1;
//267 필드와 메소드의 접근 제한
public class A {
	//public 접근 제한을 갖는 필드 선언
	public int field1;
	//default 접그 제한을 갖는 필드 선언
	int field2;
	//private 접근 제한을 갖는 필드 선언
	private int field3;
	
	//생성자 선언
	public A() {
		field1 = 1;   //O
		field2 = 1;   //O
		field3 = 1;   //O
		
		method1();    //O
		method2();    //O
		method3();    //O
	}
	//public 접근 제한을 갖는 메소드 선언
	public void method1() {}
	//default 접근 제한을 갖는 메소드 선언
	void method2() {}
	//private 접근 제한을 갖는 메소드 선언
	private void method3() {}
}
