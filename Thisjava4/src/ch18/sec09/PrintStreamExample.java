package ch18.sec09;

import java.io.*;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("c:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치");
		ps.println("프린터가 출력하는 것 처럼");
		ps.println("데이터를 출력합니다");
		
		ps.flush();
		ps.close();		
	}
}
