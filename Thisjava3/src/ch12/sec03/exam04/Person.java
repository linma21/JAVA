package ch12.sec03.exam04;
//505 레코드를 사용하지 않은 DTO
public class Person {
	private final String name;
	private final int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String name() {return this.name;}
	public int age() {return this.age;}

	@Override
	public int hashCode() {
		return age;}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
}
