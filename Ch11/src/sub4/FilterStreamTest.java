package sub4;

import java.util.Collections;
import java.util.List;

/*
 * 날짜 : 24/01/11
 * 이름 : 최이진
 * 내용 : 컬렉션 Stream Filter 실습
 */
public class FilterStreamTest {
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(numbers);
		
		// 중복 제거
		numbers.stream().distinct().forEach( num-> System.out.print(num+", "));
		System.out.println();
		
		// 5이상 데이터만 필터링
		numbers
		     .stream()
		     .filter(num->num >=5)
		     .forEach(num-> System.out.print(num+", "));
		System.out.println();
		
		// 중복 제거하고 짝수 데이터만, 내림차순
		numbers
		     .stream()
		     .distinct()
		     .filter(num -> num % 2 ==0)
		     .sorted(Collections.reverseOrder())
		     .forEach(num-> System.out.print(num+", "));
	}
}
