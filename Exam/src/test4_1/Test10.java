package test4_1;

import java.io.File;
import java.io.FileWriter;

public class Test10 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java\\Desktop\\수행평가";
		
		try {
		File file = new File(path);
		FileWriter fw = new FileWriter(file);
		
		for(int x=2 ; x<=9; x++) {
			System.out.println(x+"단");
			for(int y=1; y<=9; y++) {
				int z = x*y;
				System.out.println(x+" x "+y+" = "+ z);
			}
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("구구단 생성 완료");
	}
}
