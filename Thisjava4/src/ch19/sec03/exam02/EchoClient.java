package ch19.sec03.exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost", 50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			String sendmessage = "나는 자바가 좋아 ";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.flush();
			
			System.out.println("[클라이언트] 데이터 보냄"+ sendmessage);
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			
			System.out.println("[클라이언트] 데이터 받음" +receiveMessage);
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
