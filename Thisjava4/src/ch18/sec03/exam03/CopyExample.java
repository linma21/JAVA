package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) {
		String originalFileName = "C:/Temp/test.jpg";
		String targetFileName = "C:/Temp/test2.jpg";
		
		InputStream is;
		OutputStream os;
		try {
			 is = new FileInputStream(originalFileName);
			 os = new FileOutputStream(targetFileName);
		
		
		byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data, 0, num);
		}
		os.flush();
		os.close();
		is.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사 완료");		
	}
}
