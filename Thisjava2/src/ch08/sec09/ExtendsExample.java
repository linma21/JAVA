package ch08.sec09;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		System.out.println();
		 //----자식 인터페이스를 변수에 대입하면 부모의 메서드도 전부 호출 가능	
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
