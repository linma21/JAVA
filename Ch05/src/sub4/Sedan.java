package sub4;
//extends Car - Car 클래스를 상속받는다.
public class Sedan extends Car{
	
	private int cc;
		
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); //부모클래스의 생성자 호출 -공통된 부분
		this.cc = cc; //자식 클래스 만의 기능
	}
	
	public void speedTurbo() {
		this.speed += 20; 
	}
	public void show() {
		super.show(); //부모의 show 메서드 출력
		System.out.println("배기량 : "+ this.cc);
	}
}
