package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

//782
public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			
			byte a = 10;
			byte b = 10;
			byte c = 10;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
