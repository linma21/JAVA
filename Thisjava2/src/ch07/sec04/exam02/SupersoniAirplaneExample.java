package ch07.sec04.exam02;

public class SupersoniAirplaneExample {
	public static void main(String[] args) {
		SupersoniAirplane sa = new SupersoniAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersoniAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersoniAirplane.NORMAL;
		sa.fly();
		sa.land();		
	}
}
