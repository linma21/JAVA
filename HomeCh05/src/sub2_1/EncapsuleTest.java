package sub2_1;

/*
 * 날짜 : 2024/01/02
 * 이름 : 최이진
 * 내용 : 캡슐화 실습하기
 */
public class EncapsuleTest {

	public static void main(String[] args) {
			
		// 객체 생성
		Car sonata = new Car("소나타","흰색",10);
			
		//캡슐화된 속성에 대한 초기화는 생성자에서 수행
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 10;
			
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
			
		// 캡슐화된 속성에 대한 수정을 위해 setter 호출
		sonata.setColor("회색");
		sonata.show();
			
		// Account 객체 생성 및 초기화
		Account kb = new Account("국민은행", "123-45-6789", "김유신", 10000); //생성자 Account 를 kb에 대입
		kb.deposit(80000);
		kb.withdraw(7000);
		kb.show();
		}

}
