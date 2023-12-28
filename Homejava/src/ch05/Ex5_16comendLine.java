package ch05;
/*
 * p145
 * scanner 클래스의 nextLine()외에도 화면으로 입력받을 수있는 커맨드 라인
 *실행 방법 : Run -> run configurations -> Arguments -> 값입력 ->run
 *         또는 
 */
public class Ex5_16comendLine {
	
	public static void main(String[] args) {
		
		System.out.println("매개변수의 개수:" +args.length);
		
		for(int i=0; i< args.length; i++) {
			
			System.out.println("args[" + i + "] = \""+args[i] + "\"");
		}
				
	}

}
