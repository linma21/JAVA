package ch06.sec07;
//224 생성자 오버로딩
public class Car {
	
	String company = "현대";
	String model;
	String color;
	int maxspeed;
	
	Car(){}                                        //생성자 1
	
	Car(String model){                             //생성자 2
		this.model = model;
	}
	Car(String model,String color){                //생성자 3
		this.model = model;
		this.color = color;
	}
	Car(String model,String color,int maxSpeed){   //생성자 4
		this.model    = model;
		this.color    = color;
		this.maxspeed = maxSpeed;
	}

}
