package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		
		for(int i=0; i<6; i++) {
			selectNumber[i]  = random.nextInt(45) +1;
		}
		
		int[] winningNumber = new int[6];
		random = new Random(5);
		
		for(int i=0; i<6; i++) {
			winningNumber[i]= random.nextInt(45)+ 1;
			
		}
		
		Arrays.sort(selectNumber); //항목 정렬
		Arrays.sort(winningNumber);
		
		boolean result = Arrays.equals(selectNumber, winningNumber);
		if(result) {
			System.out.println("1등 당첨");
		}else {
			System.out.println("당첨되지 않았습니다");
		}
	}
}
