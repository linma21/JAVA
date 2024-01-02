package sub3;
/*
 * 접근 제어자
 * private   - 같은 클래스 내에서만 접근 가능
 * (default) - 같은 패키지(sub3) 내에서만 접근가능
 * public    - 접근 제한이 없다
 * 
 * Private Constructor (개인 생성자):
 * private Calc() {}: 클래스의 생성자가 private 으로 선언되어 외부에서 직접 객체를 생성하는 것을 막습니다.
 * 
 */
public class Calc {
	
	// 싱글톤 객체 생성
	private static Calc instance = new Calc(); //private - 외부에서 인스턴스 직접 생성 불가 
	                                           //static  - 공유가능한
	                                           //new Calc(): Calc 클래스의 새로운 인스턴스를 생성
	                                           //Calc instance: Calc 클래스의 인스턴스를 참조할 수 있는 정적 변수 instance 를 선언
	
	public static Calc getInstance() {  // - public (접근 제한 없는) static (정적 변수) 선언
		return instance;                // - 정적 변수 instance 를 쓰기 위해서는(즉, Calc 클래스의 인스턴스를 찹조하기 위해)
		                                //   getInstance 메서드를 사용해야한다.
	}
	
	private Calc() {}          //외부에서 객체(인스턴스) 생성 불가
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
}
