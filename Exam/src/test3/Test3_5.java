package test3;
/*
 * 날짜 : 24/01/04
 * 이름 : 최이진
 * 내용 : 싱글톤 객체 연습 문제
 */
class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {   //클래스와 이름이 같으면 생성자 메서드
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("===========");
		System.out.println("차량명 :" +name);
		System.out.println("가 격 :" +price);
		System.out.println("===========");
	}
}
class CarFactory {
	private static CarFactory instance = new CarFactory();  //싱글톤 패턴 - private로 외부 입력을 막는다.
	private CarFactory() {}
	
	public static CarFactory getInstance() {      //싱글톤 패턴 - 외부 입력할 수있는 Getter 설정한다.
		return instance;
	}
	
	public static Vehicle createCar(String name, int price) {
		return new Vehicle (name,price);
	}
}


public class Test3_5 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance(); //new Carfactory 불가 - private 로 막아놨음 -Getter 사용해야함
		
		Vehicle avante = factory.createCar("아반테", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}
}
