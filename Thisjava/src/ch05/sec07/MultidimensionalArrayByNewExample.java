package ch05.sec07;
//182
public class MultidimensionalArrayByNewExample {
	public static void main(String[] args) {
		//각 반이 학생수가 동일할 경우 저뭇 저장으 ㄹ위한 2차원 배열 생성
		int[][] mathScores = new int[2][3];
		//배열 초기값 출력
		for(int i = 0; i < mathScores.length; i++) {
			for(int k = 0; k< mathScores[i].length ;k++) {
				
				System.out.println("matehScores["+i+"]["+k+"]:" +mathScores[i][k]);
			}
		}
		System.out.println();
		
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		//전체 평균
		int totalStudent = 0;
		int totalScores = 0;
		for(int i =0; i< mathScores.length ; i++) {
			totalStudent += mathScores[i].length;
			for(int k = 0; k < mathScores[i].length; k++){
				totalScores += mathScores[i][k];
			}			
		}
		double totalAvg = (double) totalScores/totalStudent;
		System.out.println("전체 평균 :" +totalAvg);
		System.out.println();
		
		
		//각 반의 학생수가 다르 겨우 
		int [][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		//배열항목 초기값 출력
		for(int i = 0; i< englishScores.length ; i++) {
             for(int k = 0; k< englishScores[i].length ;k++) {
				
				System.out.println("englishScores["+i+"]["+k+"]:" +englishScores[i][k]);
			}
		}
		System.out.println();
		
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		//전체 평균
		totalStudent = 0;
		int totalESum =0;
		for(int i =0; i<englishScores.length; i++) {
			totalStudent += englishScores[i].length;
			for(int k = 0; k < englishScores[i].length; k++) {
				totalESum += englishScores[i][k];
			}
		}
		double totalEAvg = (double)totalESum / totalStudent;
		System.out.println("전체 영어 평균 : "+totalEAvg);
	}
	
	   

}
