package ch05.sec05;
//160
public class ReplaceExample {
	public static void main(String[] args) {
		String oldstr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다";
		String newstr = oldstr.replace("자바","JAVA"); //원래 문자열의 수정본이 아니라 새로운 문자열이다.
		
		System.out.println(oldstr);
		System.out.println(newstr);
	}

}
