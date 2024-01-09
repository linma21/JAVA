package ch07.sec03.exam01;

public class SmartPhone extends Phone{
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("SmatePhone(String model, String color) 생ㄹ성자 실행됨");
	}
}
