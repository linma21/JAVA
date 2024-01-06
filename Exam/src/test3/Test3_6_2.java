package test3;
/*
 * 날짜 : 24/01/04
 * 이름 : 최이진
 * 내용 : 싱글톤 객체와 인스턴스 객체 연습 문제
 */

class Adder2 {
	
	private static Adder2 instance = new Adder2();  //싱글톤 패턴
	public static Adder2 getInstance() {
		return instance;
	}
	private Adder2() {}
	
	private Adder2(int value) {
		y += value;
	}
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		this.y += y;
		y++;	
		
	}	
	public void show() {
		System.out.println("x :"+x);
		System.out.println("y :"+y);
	}

}
public class Test3_6_2 {
	public static void main(String[] args) {
		Adder2 a1 = Adder2.getInstance();
				
		a1.add(1,2);
		a1.show();		
	}
}
