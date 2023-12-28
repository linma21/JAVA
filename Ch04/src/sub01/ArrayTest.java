package sub01;
/*
 * 날짜 : 23/12/27
 * 이름 : 최이진
 * 내용 : Array 실행
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		//배열  //인덱스번호 0부터 시작
		int[]    arr1 = {1, 2, 3, 4, 5};
		char[]   arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		//원소 출력
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);

		System.out.println("arr2[2] : " + arr2[2]);
		
		System.out.println("arr3[3] : " + arr3[3]);
		
		// 배열 길이
		System.out.println("arr1 원소 갯수 : " + arr1.length);
		System.out.println("arr2 원소 갯수 : " + arr2.length);
		System.out.println("arr3 원소 갯수 : " + arr3.length);
		                                       // . 참조연산자
		
		//배열 반복문
		for(int i = 0; i<arr1.length ; i++) {
			
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		for(int n : arr1) {
			//한번 반복할때마다 n자리에 원소 대입
			System.out.print(n + " ");
		}
		System.out.println();
		for(char q : arr2) {
			System.out.print(q + " ");
			
		}
		System.out.println();
		for(String w : arr3) {
			System.out.print(w + " ");
		}
	 System.out.println();
	    //1차원
		int[] scores = {80, 60, 78, 62, 92};
	    int total =0;
	    
	    for (int i = 0; i < scores.length; i++) {
	        total += scores[i];
	    }
	    	
	   
	    System.out.println("score 전체 합 :" + total);
	
	
    	//2차원
	    
	    
    	//3차원



	}
}
