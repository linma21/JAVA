package sub7;

/*추상클래스
 * - 추상 메서드를 갖는 클래스
 * - 상속으로 사용되는 클래스
 *  
 */
public abstract class Car {
	
	protected String name;
	protected String color;
	protected int speed;
	
	public Car (String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	public abstract void speedUp(int speed); //추상 메서드 {}가아니라 ;로 씀
	public abstract void speedDown(int speed);
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("현재속도 : "+speed);
		
	}

}
