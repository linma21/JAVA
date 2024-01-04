package sub7;
/*
 * 날짜 : 24/01/04
 * 이름 : 최이진
 * 내용 : 추상클래스 실습
 */
public class AbstractTest {
	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성 안됨
		//Car car = new Car("소나타","흰색",0);
		
		//업캐스팅
		Car sonata = new Sedan("소나타","흰색",0,2000);
		Car bongo  = new Truck("봉고","남색",0,0);
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		bongo.speedUp(60);
		bongo.speedDown(10);
		bongo.show();
					
	}

}
