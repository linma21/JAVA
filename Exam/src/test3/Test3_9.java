package test3;
/*
 * 날짜 : 24/01/04
 * 이름 : 최이진
 * 내용 : 자바 추상 클래스, 다형성 연습 문제
 */
public abstract class Shape {
	public abstract void draw();
}

class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
	
}
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}
public class Test3_9 {
	
	public static void main(String[] args) {
		
		Test3_9 here = new Test3_9();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	public void draw(Shape obj){
		obj.draw();
	}
}
