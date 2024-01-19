package test1_1;

public class Test3 {
	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
		
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;
		
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
	}
}
