package test4;
/*
 * 날짜 : 24/01/12
 * 이름 : 최이진
 * 내용 : JAVA TEST4
 */
public class Test4 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");  // . 의 위치를 찾는다
		
		String title = fileName.substring(0,idx);
		String ext = fileName.substring(idx+1);
				
		System.out.println("파일명 : "+title);
		System.out.println("확장자 : "+ext);
		
		String  strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(",");   //,로 구분해서 각각의 토큰으로 나눈다 -> 토큰에 공백(space) 포함
		
		int total = 0;
		
		for(String score : scores) {
			
			total += Integer.parseInt(score.trim());  //  문자열 토큰 score 값을 int로 다시 변환
		}                                             // trim 은 문자열에 공백을 지워줌 
		System.out.println("strScores 총합 : "+total);
	}

}
