package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 24/01/12
 * 이름 : 최이진
 * 내용 : JAVA TEST4 로또
 */
public class Test7 {
	public static void main(String[] args) {
		
		for(int count =1; count <= 5; count ++) {
			System.out.println(makeLotto());
		}
	}

	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {          //--무한루프
			int num = (int) Math.ceil(Math.random() * 45); // 랜덤 숫자 정수로 
			
			lottoSet.add(num);
			
			if(lottoSet.size() > 5) {
				
				break;
			}
		}		
		//정렬을 위해 TreeSet 사용 - 오름차순으로 정렬해줌
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
