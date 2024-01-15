package ch14.sec07.exam03;
//622
public class PrintThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("실행 중...");
			if(Thread.interrupted()) {    //---interrupt() 메소드가 호출 되었다면, while문 빠져나감
				break;
			}
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
