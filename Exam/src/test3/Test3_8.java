package test3;
/*
 * 날짜 : 24/01/04
 * 이름 : 최이진
 * 내용 : 다형성 연습 문제
 */
class Product{
	
	protected String category;
	protected int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void info() {} //
}
class Television extends Product{
	public Television(String category, int price) {
		super(category,price);
	}
	@Override
	public void info() {
		System.out.println("제품분류 : "+category);
		System.out.println("제품가격 : "+price);
	}
}
class Computer extends Product{

	public Computer(String category, int price) {
		super(category, price);
		
	}
	@Override
	public void info() {
		System.out.println("제품분류 : "+category);
		System.out.println("제품가격 : "+price);
	}
}
public class Test3_8 {
	public static void main(String[] args) {
		
		Product p1 = new Television("가전", 100);
		Product p2 = new Computer("컴퓨터", 100);
		
		p1.info();
		p2.info();
	}

}
