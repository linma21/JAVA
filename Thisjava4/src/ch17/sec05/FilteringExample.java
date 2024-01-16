package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		//List
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("신용권");
		list.add("박병렬");
		
		//중복 제거
		list.stream()
			.distinct()
			.forEach(n -> System.out.print(n + ", "));
		System.out.println();
		
		//중복 요소를 먼저 제거하고, 신 으로 시작하는 요소 필터링
		list.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));
	}
}
