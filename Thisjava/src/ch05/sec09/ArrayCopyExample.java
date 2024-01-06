package ch05.sec09;
//188
public class ArrayCopyExample {
	public static void main(String[] args) {
		//길이 3인 배열
		String[] oldarr = {"java","array","copy"};
		
		//길이 5인 배열
		String[] newStr = new String[5];
		//항목 복사
		System.arraycopy(oldarr,0,newStr,0,oldarr.length);
		
		for(int  i= 0; i< newStr.length; i++) {
			System.out.print(newStr[i]+",");
		}
		
	}

}
