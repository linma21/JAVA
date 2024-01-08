package ch06.sec15;
//275
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getinstance() {
		return singleton;
	}

}
