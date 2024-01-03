package sub5;

public class Car {
		//protected 자식 클래스에서 참조할 수 있도록 private 가 아닌 protected
	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) { //생성자
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}
