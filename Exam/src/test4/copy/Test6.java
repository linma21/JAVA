package test4.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 날짜 : 24/01/12
 * 이름 : 최이진
 * 내용 : JAVA TEST4 List
 */
public class Test6 {
	public static void main(String[] args) {
		
		// 60~100사이의 임의의 수를 10개 더하므로 결과값이 항상다름
		printList(createList());
	}

	public static void printList(List<Integer> scoreList) {
		
		int total = 0;
		int size = scoreList.size();
		
		for(int i = 0; i < size ; i++) {
			
			int score = scoreList.get(i);
			
			total += score;
			
			System.out.print(score);
			
			if(i == size - 1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		}
		System.out.println(total);
		
	}

	public static List<Integer> createList() {
		
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i = 1; i <= 10 ; i++) {
			//60~100사이의 임의의수
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
		}
		return scoreList;
	}
	

}