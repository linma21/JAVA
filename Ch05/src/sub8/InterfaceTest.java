package sub8;
/*
 * 날짜 : 24/01/04
 * 이름 : 최이진
 * 내용 : 인터페이스(interface) 실습
 */

class Computer {
	public void boot() {
		System.out.println("시스템 부팅...");
	}	
}

interface Internet {
	public void access();	
}

class Tv extends Computer implements Internet{

	@Override
	public void access() {
		System.out.println("인터넷 접속...");		
	}
	
	public void show() {
		System.out.println("Tv 시청...");
	}	
}


public class InterfaceTest {
	public static void main(String[] args) {
		
	    //인터페이스 예제1 - 표준화된 클래스 설계
		Remotecontrol lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundUp();
		lg.powerOff();
		
		Remotecontrol ss = new RemoteSamSung();
		ss.powerOn();
		ss.chDown();
		ss.soundDown();
		ss.powerOff();
				
		//인터페이스 예제2 - 유연성(결합도 완화)
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb); //업캐스팅 
		
		socket.switchOn();
		socket.switchOff();
				
		//인터페이스 예제3 - 다중 상속 효과 (JAVA는 다중 상속 안됨)
		Tv smartTv = new Tv(); //Computer로 업캐스팅 하면 access가 안됨. Internet으로 하면 boot가 안됨
		smartTv.boot();
		smartTv.access();
		smartTv.show();
				
	}
}
