package ch06.sec12.hyundai;
//260
//import 문으로 다른 패키지 클래스 사용으 명시
import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
	//부품 필드 선언
	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire(); //두 패키지에 동명의 클래스가 있기 때문에 구분해서
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
}
