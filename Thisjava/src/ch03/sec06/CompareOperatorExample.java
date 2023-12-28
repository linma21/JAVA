package ch03.sec06;
//90
public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1 :"+result1);
		System.out.println("result2 :"+result2);
		System.out.println("result3 :"+result3);
		
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); //65<66
		System.out.println("result4: "+result4);
		
	    String str1 = "JAVA";
	    String str2 = "자바";
	    boolean result5 = (str1.equals(str2));
	    boolean result6 = (! str1.equals(str2)); //!부정의미
	    System.out.println("result5: "+result5);
	    System.out.println("result6: "+result6);
			
	}

}
