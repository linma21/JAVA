package sub3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜 : 24/01/11
 * 이름 : 최이진
 * 내용 : 컬렉션 Stream 실습
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
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름 : "+name+" 나이 : "+age;
	}	
}
public class StreamTest {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("김유신");
		names.add("김춘추");
		names.add("장보고");
		names.add("강감찬");
		names.add("이순신");
		
		// 외부 반복자를 이용한 출력
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 내부 반복자를 이용한 출력
		Stream<String> stream = names.stream();
		stream.forEach((name)->{
			System.out.println(name);
		});
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신", 23));
		persons.add(new Person("김춘추", 21));
		persons.add(new Person("장보고", 33));
		persons.add(new Person("강감찬", 43));
		persons.add(new Person("이순신", 53));
		
		// 외부 반복자 출력
		for(Person person : persons) {
			System.out.println(person);
		}
		
		// 내부 반복자 출력
		Stream<Person> stream2 = persons.stream();
		stream2.forEach(System.out::println);		
	}
}
