package ch07.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시","은색" );
		
		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델 : "+myPhone.model);
		System.out.println("색상 : "+myPhone.color);
		
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태 : "+myPhone.wifi);
		
		//phone으로 부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.redeiveVoice("안녕하세요!");
		myPhone.sendVoice("네 반갑습니다.");
		myPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
