package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		//중간 처리 메소드 peek()을 이용해서 반복 처리
		int total = Arrays.stream(intArr)
					.filter(a -> a%2 ==0)
					.peek(n -> System.out.println(n))
					.sum();
		System.out.println("총 합 : "+total+"\n");
		
		//최종 처리 메소드 forEach()를 이용해 반복 처리
		Arrays.stream(intArr)
			.filter(a-> a%2==0)
			.forEach(n-> System.out.println(n));
	}
}
