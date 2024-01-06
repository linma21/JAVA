package ch05.sec11;
//192
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("입력값 부족");
			System.exit(0);  //프로그램 강제 종료
		}
		String strNum1 = args[0];  //첫번째 데이터 얻기
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1); //문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);
		
		
		int result = num1 +num2;
		System.out.println(num1 + "+"+num2+"="+result);
	}//Run - Run Configurations - Arguments - program arguments 입력란에 숫자 num1 ,num2 값 입력 - 문자열취급

}
