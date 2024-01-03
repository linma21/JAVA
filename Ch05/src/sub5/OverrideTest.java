package sub5;
/*
 * 날짜 : 24.01.03
 * 이름 : 최이진
 * 내용 : JAVA 메서드 재정의(Override) 실습
 * 
 */

class AAA {
	public void method1() {
		System.out.println("AAA : method1...");
	}
	public void method2() {
		System.out.println("AAA : method2...");
	}
	public void method3() {
		System.out.println("AAA : method3...");
	}
	
	
}
class BBB extends AAA {
	@Override
	public void method2() { //AAA의 method2을 Override
		System.out.println("BBB : method2...");
	}
	//Overload
	public void method3(int a) { //매개변수가 다르기 때문에 AAA의 method3과는 별개의 메서드 Override 가 아니라 Overload
		System.out.println("BBB : method3...");
	}
	
}
class CCC extends BBB {
	@Override
	public void method1() { //AAA의 method1을 Override - 덮어쓰기
		System.out.println("CCC : method1...");
	}
	@Override
	public void method2() { //AAA의 method2을 BB가 Override 한걸 다시 Override
		System.out.println("CCC : method1...");}
	//Overload
	public void method3(int a, int b) { //매개변수가 다르기 때문에 AAA,BBB의 method3과는 별개의 메서드 Override 가 아니라 Overload
	    System.out.println("CCC : method3...");}
		
}
public class OverrideTest {
	
	public static void main(String[] args) {
				
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method3(); // 결과 : AAA method3 실행
		c.method3(0); // 결과 : BBB method3 실행
		c.method3(1,2);// 결과 : CCC method3 실행
		
		//override 구현 객체 생성
		Sedan sonata = new Sedan ("소나타", "흰색", 0,2000);
		Truck bongo = new Truck ("봉고","남색",100,0);
		
		sonata.speedUp(80);
		sonata.show();
		
		bongo.speedDown(60);
		bongo.show();
	}
}


