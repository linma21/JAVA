package test3_1;

public class Test1 {
	
	private String name;
	private int age;
	
	public Test1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("===============");
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
		System.out.println("===============");
	}
	public static void main(String[] args) {
		Test1 kim = new Test1("kim", 23);
		Test1 lee = new Test1("lee", 31);
		kim.show();
		lee.show();
		
	}

}
