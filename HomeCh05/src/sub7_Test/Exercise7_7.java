package sub7_Test;

class Outer2 {
	static class Inner {
		int iv = 100;
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		Outer2.Inner inner = new Outer2.Inner();
		System.out.println(inner.iv);
	}

}
