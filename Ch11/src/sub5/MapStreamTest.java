package sub5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 날짜 : 24/01/11
 * 이름 : 최이진
 * 내용 : 컬렉션 Map Stream 실습
 */
class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "이름 : "+name+" 나이 : "+age;
	}	
}
public class MapStreamTest {
	
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신", 23));
		persons.add(new Person("김춘추", 21));
		persons.add(new Person("장보고", 33));
		persons.add(new Person("강감찬", 43));
		persons.add(new Person("이순신", 53));
		
		// Map : 스트림 특정 요소를 다른 요소로 변환
		persons
		      .stream()
		      .map(person -> person.getName())
		      .forEach(name -> System.out.println(name));
		
		System.out.println();
			
		// flatMap : 스트림 특정 요소를 다른 여러 개의 요소로 변환
		List<List<String>> nestesList = Arrays.asList(
				Arrays.asList("apple","banana"),
				Arrays.asList("orange","grape"),
				Arrays.asList("peach","melon")
	);
		nestesList.stream()
		          .flatMap(list -> list.stream())
		          .forEach(str -> System.out.print(str+", "));
				
	}		
}
