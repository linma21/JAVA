package sub02;
/*
 *  날짜 : 23/12/29
 *  이름 : 최이진
 *  내용 : 메서드 실습하기
 */
public class MethodTest {
	
	// main method :자바 시작 메서드
	public static void main(String[] args) {
		
		//메서드 호출 아래에 정의된 f()에 int x 값을 넣어줌
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 = "+y1);
		System.out.println("y2 = "+y2);
		System.out.println("y3 = "+y3);
		
		//메서드 지역변수의 콜스텍 - 메서드에 사용된 스텍을 불러옴 
		int t1 = sum(1, 10); //sum 이라는 메서드를 호출해서 start 에 1, end 에 10 대입 
		int t2 = sum(1, 100);
		
		System.out.println("t1 : "+ t1);
		System.out.println("t2 : "+ t2);
				
	} //main end
	
	//전역변수
	int num = 1;
			
	//메서드 정의 -일반적으로는 static 이 빠진 모양?
	public static int f(int x) {
		
		//지역변수 y
		int y = 2 * x + 3;
		
		return y;
	} // f 메서드 끝 x 값을 입력하며 y 라는 값이 반환

	public static int sum(int start, int end) {
		
		//지역변수 total, start, end
		int total = 0;
		
		for(int k=start ; k <= end ; k++) {
			total += k;			
		}
		return total;	
	}	
}
