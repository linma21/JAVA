package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<>();
		stdList.add(new Student("홍길동", 80));
		stdList.add(new Student("신영권", 10));
		stdList.add(new Student("유미선", 20));
		
		//오름차순
		stdList.stream()
			.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
			.forEach(s -> System.out.println(s.getName()+" : "+s.getScore()));
		System.out.println();
		
		//내림차순
		stdList.stream()
			.sorted((s1, s2)-> Integer.compare(s2.getScore(), s1.getScore()))
			.forEach(s -> System.out.println(s.getName()+" : "+s.getScore()));
	}
}
