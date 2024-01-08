package sub01;
/*
 * 날짜 : 24/01/08
 * 이름 : 최이진
 * 내용 : 예외처리 실습하기
 */
public class ExceptionTest {
	public static void main(String[] args) {
		
		////////////////////////////////
		// 실행 예외(런타임 타임)
		////////////////////////////////
		
		//예외 상황 1. 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;		
		int r4 = 0;
				
		try {
			//예외가 발생할 코드
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
		    r4 = num1 / num2;  //r1,2,3은 에러발생 하지 않았지만 코드의 일관성을 위해 try 문에 함께 넣어준다
		}catch (Exception e) {   //catch(ArithmeticException e)는 ArithemeticException 만 잡는다
			//예외가 발생 했을 때
			e.printStackTrace(); //예외 정보 출력
		}		
		System.out.println("r1 : " +r1);
		System.out.println("r2 : " +r2);
		System.out.println("r3 : " +r3);
		System.out.println("r4 : " +r4);
		
		//예외 상황 2. 배열의 인덱스번호가 없을 때
		int[] arr = {1,2,3,4,5};
		
		
		try {
		for(int i =0; i < 6 ; i++) {
			System.out.println("arr["+i+"] :" + arr[i]);// arr[5] 가 존재하지 않음
		  }
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//예외 상황 3. 객체 생성없이 메서드 호출
		            //Animal a; -참조변수 선언
		            //Animal a = new Animal(); - 참조 객체 생성
		Animal a = null; 
		
		try {
		a.move();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		//예외 상황 4. 잘못된 캐스팅
		Animal a1 = new Tiger(); //업캐스팅
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		try {
		Tiger tiger = (Tiger) a1; //다운캐스팅
		Shark shark = (Shark) a2; //a2는 Eagle 잘못된 다운캐스팅
		
		tiger.move();
		tiger.hunt();
		
		shark.move();
		shark.hunt();
		
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		
        ////////////////////////////////
		// 일반 예외(컴파일 타임)
        ////////////////////////////////
		
		
			try {
				Class animal = Class.forName("sub1.Lion");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}finally {
				//예외처리에 발생여부에 상관없이 마지막에 항상 실행되는 코드
				System.gc(); //메모리 정리
				
				System.out.println("finally 실행 ...");
			}	
		System.out.println("프로그램 정상 종료");
				
	}	
}
