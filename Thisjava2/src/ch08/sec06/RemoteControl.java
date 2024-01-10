package ch08.sec06;
//357
public interface RemoteControl {
	//상수필드
	int MAX_VILUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 인스턴스 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			//추상 메서드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메서드
	static void changeBatttery() {
		System.out.println("리모컨 건전지를 교체...");
	}
}
