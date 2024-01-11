package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 24/01/11
 * 이름 : 최이진
 * 내용 : JAVA  Buffer 보조 스트림
 */
public class BufferIOTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\java\\Desktop\\JAVA.zip";
		String target = "C:\\Users\\java\\Desktop\\JAVACopy.zip";
		
		try {
			// 스트림 생성 (연결)
			FileInputStream  fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조 스트림 생성
			BufferedInputStream  bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			while(true) {
				
				//파일 읽기
				int data = bis.read();
								
				if(data == -1) {
					//파일 모두 읽었을 때 반복 종료
					break;
				}
				
				//char ch = (char) data;
				
								
				//System.out.print(ch);
				
				//파일 쓰기
				bos.write(data);
			}
			    //스트림 해제
			   bos.flush(); // 잔여 데이터 비우기
			   
			   bis.close();
			   bos.close();
			   
			   fis.close();
			   fos.close();
			  
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료 ...");
	}
}
