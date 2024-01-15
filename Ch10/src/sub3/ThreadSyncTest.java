package sub3;
/*
 * 날짜 : 24/01/15
 * 이름 : 최이진
 * 내용 : JAVA Thread 동기화 상태 실습
 * 
 * 동기(Synchronize)
 *   - 동기 방식은 순서에 따라서 차례대로 처리되는 실행 흐름
 *   - 운영체제 스케줄링 등
 *   
 * 비동기(Asynchronize)
 *   - 비동기 방식은 순서에 상관없이 처리되는 실행 흐름
 *   - 웹 비동기 통신
 */

class Count {
	private int num;
	
	public int getNum() {
		return num;
	}
	/*
	 임계 영역
	 - 멀티 스레드에 의해 공유자원이 참조되는 코드의 범위
	 - 스레드간 경합이 발생   
	 - 동기화 처리를 수행해서 어느 한 스레드가 사용하면 락을 걸어 다른 스레드의 침범을 막음   
	 - 너무 많은 스레드가 발생할 경우 교착상태(DeadLock)에 빠질 수 있음  
	 */
	public synchronized void setNum() {

		num++;
	}
}
class CountThread extends Thread{
	
	private Count count;
	
	public CountThread(Count count) {
		this.count = count;
	}
	@Override
	public void run() {
		
		for(int i = 1; i <=1000;i++) {
			count.setNum();
		}
	}
}
public class ThreadSyncTest {
	public static void main(String[] args) {
		
		Count count = new Count();
		
		CountThread ctr1 = new CountThread(count);
		CountThread ctr2 = new CountThread(count);
		CountThread ctr3 = new CountThread(count);
		
		ctr1.start();
		ctr2.start();
		ctr3.start();
				
		try {
			ctr1.join();
			ctr2.join();
			ctr3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("count : " + count.getNum());
	}
}
