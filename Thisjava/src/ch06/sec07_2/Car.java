package ch06.sec07_2;
//228
public class Car {
	
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model){
		//생성자 3 호출
		this(model,"은색,250");
	}
	
	Car(String model, String color){
		//생성자 3 호출
		this(model,color, 250);
	}
	//생성자 3
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
