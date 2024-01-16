package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//682
public class SynchronizedMapExample {
	public static void main(String[] args) {
	
		//Map 컬렉션 생성
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
		
		// 작업 스레드
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1; i <=1000 ; i++) {
					map.put(i, "내용"+i);
				}
			}
		};
		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i <=2000 ; i++) {
					map.put(i, "내용"+i);
				}
			}
		};
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
		}		
		System.out.println("총 객체 수 : "+ map.size());
		System.out.println();	
	}
}
