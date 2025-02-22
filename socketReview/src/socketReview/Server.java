package socketReview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket = null;
		Socket socket = null; 
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("연결 대기중...");
			
			socket = serverSocket.accept();
			System.out.println("연결되었습니다.");
			
//			네트워크 입출력 스트림 생성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 읽기 - 받음
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 작성 - 내보냄
			
//			채팅은 횟수 제한 없음
			while(true) {
				String inMessage = in.readLine();
				System.out.println("클라이언트 >> " + inMessage);
				
//				클라이언트로 데이터 전송
				System.out.println("서버에서 클라이언트로 보내기 >> ");
				String outMessage = sc.nextLine();
				out.write(outMessage + "\n");
				out.flush(); // 버퍼를 비워줌 => 메세지가 socket으로 넘어감 (flush : 버퍼가 지워지는 것)
			}

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
			if(socket != null) {
				socket.close();
			}
			if(serverSocket != null) {
				serverSocket.close();
			}
		}
		
	}

}
