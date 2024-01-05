package ch05.sec05;
//161
public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "880818-124567";
		
		String firstNum = ssn.substring(0,6);  //6의 앞까지만 참조
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
