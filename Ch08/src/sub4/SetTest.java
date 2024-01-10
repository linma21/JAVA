package sub4;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 날짜 : 24/01/10
 * 이름 : 최이진
 * 내용 : Java HashSet 실습
 */
public class SetTest {
	
	public static void main(String[] args) {
		
		// HashSet(집합) 생성
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		
		System.out.println(set);
		
		// 반복자 Iterator를 이용한 데이터 출력
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			//다음 데이터가 있을 때까지 반복
			System.out.println(it.next());
		}		
		for(int num : set ) {
			System.out.println(num);
		}		
	}
}
