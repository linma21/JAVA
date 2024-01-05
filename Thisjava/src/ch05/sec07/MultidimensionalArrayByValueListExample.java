package ch05.sec07;
//178
public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {
				      {80,90,96},
				      {76,88}};
		 //배열의 길이
		System.out.println("2차원 배열의 길이( 첫번쨰 반의 학생 수 ): "+ scores[0].length);
		System.out.println("2차원 배열의 길이( 두번쨰 반의 학생 수 ): "+ scores[1].length);
		
		//첫번째 반의 세번ㅉ 학생 점수 읽기
		System.out.println("scores[0][2]:" + scores[0][2]);
		
		//두번째 반의 두번째 학생 점수 읽기
		System.out.println("scores[0][2]:" + scores[1][1]);
		
		//첫번째 반의 평균 구하기
		int class1Sum = 0;
		for(int i=0; i< scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("1반의 평균 :" +class1Avg);
		
		//첫번째 반의 평균 구하기
		int class2Sum = 0;
		for(int i=0; i< scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("2반의 평균 :" +class2Avg);
		
		//전체 학생의 평균
		int sum = 0;
		int total = 0;
		for(int i = 0; i< scores.length;i++) {
			total += scores[i].length;
			for(int k = 0; k< scores[i].length;k++) {
				sum += scores[i][k];
			}
		}
		double totalAvg = (double) sum/total;
		System.out.println("전체 평균 :" + totalAvg);
	}
	

}
