package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3_5Buffered {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(br.readLine());

	        for (int i = 0; i < (N / 4); i++) {
	            System.out.print("long ");
	        }
	        System.out.print("int");

	        // BufferedReader 닫기
	        br.close();
	    }
	}


