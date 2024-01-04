package test3;
/*
 * 날짜 : 24/01/04
 * 이름 : 최이진
 * 내용 : 자바 클래스 연습 문제
 */
public class Test3_1 {
	
	private String name;
	private int age;
	
	public Test3_1(String name, int age) {
		this.name = name;
		this.age =  age;
		
	}
	public void show() {
		System.out.println("=============");
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
		System.out.println("=============");
	}
	public static void main(String[] args) {
		
		Test3_1 kim = new Test3_1("김유신",23);
		Test3_1 lee = new Test3_1("이순신",31);
		
		kim.show();
		lee.show();		
	}
}
