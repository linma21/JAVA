package ch06.sec10.exam02;
//249 정적 블록
public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	static {
		info = company+"-"+model; //info의 초기값
	}
}
