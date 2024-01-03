package sub3_1;

/*
 * 날짜 : 2024/01/02
 * 이름 : 최이진
 * 내용 : 클래스 변수, 클래스 메서드 실습하기
 *
 * 클래스 변수, 클래스 메서드(정적변수, 정적메서드)
 *  - static을 선언한 변수, 메서드로 Method Aread에 생성되는 특징
 *  - 별도의 객체 생성(new) 없이 클래스 타입으로 바로 참조, 호출
 *  - 객체(인스턴스)간의 데이터 공유를 목적으로 정적변수, 정적메서드 사용
 *
 * 싱글톤(Singleton)
 *  - static을 활용한 싱글톤 객체는 오직 하나의 인스턴스로 메모리상(Method Area)에 존재
 *  - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
 */


class Increment {
	private int num1; //인스턴스 변수 
	public static int num2; //정적변수(공유변수)
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}

public class StaticTest {

	public static void main(String[] args) { // 이 메서드의 인스턴스(객체)에 모두 접근 가능
		// Car 객체 생성
		Car sonata = new Car("소나타", "흰색", 10);  //public Car(String name, String color, int speed) 에 대입해서 sonata에 입력
		Car avante = new Car("아반테", "검정", 20);
		Car grande = new Car("그랜저", "남색", 30);

		sonata.show();  //각각의 차량 인스턴스에 대해 sub1 car show 메서드를 호출하여 차량 정보를 출력
		avante.show();
		grande.show();
		
		// 전체 차량 수
		System.out.println("전체 차량수 : " + Car.count);
		
		// Increment 실습
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		// static을 활용한 싱글톤 예제
		Calc cal = Calc.getInstance();  // Calc 클래스의 싱글톤 인스턴스를 변수 cal 에 할당 
		
		int rs1 = cal.plus(1, 2);       //
		int rs2 = cal.minus(1, 2);
		int rs3 = cal.multi(2, 3);
		int rs4 = cal.div(4, 2);
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
	}
	
}
