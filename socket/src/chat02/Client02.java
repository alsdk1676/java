package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws IOException {
		Socket clientSocket = null;
		BufferedReader in = null;
		BufferedWriter out = null; // 양방향이기 떄문에 버퍼 불러오기
		Scanner sc = new Scanner(System.in);
		
		String serverIp = "localhost"; // 내가 나한테 접속할 때
		
		try {
//			IP, port
			clientSocket = new Socket(serverIp, 7777);
			System.out.println("서버와 연결되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			
			while(true) {
				System.out.println("클라이언트에서 서버로 보내기 >> ");
				String outMessage = sc.nextLine();
				
				out.write(outMessage + "\n");
				out.flush();
				
//				서버로부터 메세지 듣기
				String inMessage = in.readLine();
				System.out.println("서버 >> " + inMessage);
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sc != null) {
				sc.close();
			}
			if(out != null) {
				out.close();
			}
			if(in != null) {
				in.close();
			}
			if(clientSocket != null) {
				clientSocket.close();
			}
			
		}
		
	}

}
