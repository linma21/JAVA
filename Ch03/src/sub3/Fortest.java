package sub3;
/*
 * 날짜 : 23/12/27
 * 이름 : 최이진
 * 내용 : 반복문 for 실행
 */
public class Fortest {

	public static void main(String[] args) {
		
		//for(초기식 : 조건식 : 증감식) 값이 조건식에 맞지 않을때까지 반복
		for(int i=1 ; i<=5 ; i++) {
 		 System.out.println("i : " + i);
		
		}
		//1부터 10까지 합
		int sum = 0;
		
 		for(int k=1 ; k<=10 ; k++ ) {
		   sum = sum + k;
		   //sum += k; 
		}
		System.out.println("1부터 10까지 합 : " + sum);
		
		//1부터 10까지 짝수합
		int tot = 0;
		
		for(int k =1 ; k <= 10 ; k++ ) {
			
			if( k % 2 == 0) {
				tot = tot + k;
			}
		}
		
		System.out.println("1부터 10까지 짝수합 :" + tot);
				
		//for 중첩
	    for(int a=1 ; a <= 3 ; a++) {
	    	
		   System.out.println("a : " + a);
		   		   
		  for(int b=1 ; b<=5 ; b++ ) {
			  
			  System.out.println("b : " + b);
			  
		  }
	  }
		
		//구구단
	    for (int x=2 ; x<=9 ; x++) {
	    	
	    	System.out.println(x+"단");
	    	
	    	for(int y=1 ; y<=9 ; y++) {
	    		int z = x * y;
	    		System.out.printf("%d x %d = %d\n", x, y, z);
	    	}
	    	
	    }	    
		//별삼각형
		for(int start=1 ; start <= 10 ; start++) {
			
			for(int end=1 ; end <= start ; end++) {
				
				System.out.print("★");
				
			}			
			System.out.println();
		}
	
	    //별 역삼각형
	    for(int startt=1; startt <= 10 ; startt++) {
	    	for(int endd=10 ; endd >= startt ; endd--) {
	    		
	    		System.out.print("★");
	    	}
	    	System.out.println();
	   	    }
	
	   //별 피라미드
	   
	    for(int quf = 0 ; quf <= 5 ; quf++) {
	    	for(int rmx = 5 ; rmx >= quf ; rmx--) {
	    		System.out.print(" ");
	    	}	
	    	for(int vlfk = 1 ; vlfk <= quf*2+1 ; vlfk++) {
	    		System.out.print("★");
	    	}
	    	System.out.println();
	    	
	    	}
	    // 빈칸으로 역피라미드 만들기 ->별 입력 	
	    	
	    }
	
	}
