package ch05.sec10;
//190
public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		for(int score : scores) { //5개 항목이 한번씩 score 변수에 정장되고 sum에 누적됨
			sum += score;
		}
		System.out.println("점수 총합 : " +sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " +avg);
	}

}
