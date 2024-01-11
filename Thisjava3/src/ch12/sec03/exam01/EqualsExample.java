package ch12.sec03.exam01;

public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {       //-----매개값이 member 이고 id도 동일하므로 true
			System.out.println("obj1 과 obl2는 동등합니다.");
		}else {
			System.out.println("obj1 과 obl2는 동등하지 않습니다.");
		}
		if(obj1.equals(obj3)) {       //-----매개값이 member 이지만 id가 다르므로 false
			System.out.println("obj1 과 obl3는 동등합니다.");
		}else {
			System.out.println("obj1 과 obl3는 동등하지 않습니다.");
		}
	}
}
