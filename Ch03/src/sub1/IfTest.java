package sub1;

/*
 * 날짜 : 23/12/27
 * 이름 : 최이진
 * 내용 : 조건문 if 실습하기 
 */


public class IfTest {
	
	public static void main(String[] args) {

		//if(조건문) 조건이 참일 때 시행
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			
			System.out.println("num1은 num2보다 작다.");
			
	}
		
		if (num1 > 1) {
			System.out.println("num1이 1보다 크다."
					);
		}
		
		if(num1 > 0) {
			if(num2> 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다");
				//if에 if가 포함되어 있으면 조건문 모두 만족해야 출력
			}
			
			if(num1 > 0 && num2 > 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다");
				// 연산자 &&로 한 조건문안에 써도 같은 출력
			}
			
		}
		
		//if ~ else
		int var1 =1 , var2 = 2;
		
		
		if(var1 > var2) {
			//조건이 참일 때
			System.out.println("var1이 var2보다 크다.");
			
		}else {
			//조건이 거짓일 때
			System.out.println("var1이 var2보다 작다");
			
	
		}
		
			//if ~ else if else 
		//먼저 쓴 조건문이 참일 때 우선실행 되고 뒤에 것은 실행되지 않는다
		int n1 =1 , n2 = 2 ,n3 = 3,  n4 = 4;
		
		if( n1 > n2 ) {
			System.out.println("n1이 n2보다 크다");
		}else if( n2 > n3 ) {			
			System.out.println("n2이 n3보다 크다");
		}else if( n3 > n4) {			
			System.out.println("n3이 n4보다 크다");
		}else { 
			System.out.println("n4가 가장 크다.");
		}
		}
		
	}

