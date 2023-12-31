package test3;
/*
 * 날짜 : 24/01/04
 * 이름 : 최이진
 * 내용 : 자바 클래스 생성자 연습 문제
 */
class King {
	private String name;
	private int year;
	
	public King(int year){
		this("정조");           //this. 은 생성자 호출 ("문자열")이 들어가는 생성자 를 호출한다.
		this.year = year;
	}
	public King(String name){   //("문자열")이 들어가는 생성자 
		this.name = name;
		
	}
	public King(String name, int year) {
		this.name = name;
		this.year = year;
	}
	public void show() {
		System.out.println("name :" +name);
		System.out.println("year :" +year);
	}
	
}

public class Test3_2 {
	
	public static void main(String[] args) {
		King k1 = new King("태조",1392);
		King k2 = new King("세종대왕");
		King k3 = new King(1776);
		
		k1.show();
		k2.show();
		k3.show();
	}

}
