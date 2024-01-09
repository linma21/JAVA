package ch07.sec10.exam01;
//326
public class SmartPhone2 extends Phone2{
	
    //생성자 선언
	SmartPhone2(String owner) {
		//Phone 생성자 호출
		super(owner);
		
	}
	//메소드 선언
	void internetSearch() {
		System.out.println("인터넷을 검색합니다.");
	}
	public void soundUp() {
		System.out.println("음량을 높입니다.");
	}

}
