package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜 : 24/01/17
 * 이름 : 최이진
 * 내용 : 자바 HTTP 통신 실습
 */
public class Httptest {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://google.com");
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./Result.txt");  // ./는 현재 폴더
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				
				System.out.println(line);
				fos.write(line.getBytes());				
			}
			br.close();
			fos.close();
						
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");		
	}
}
