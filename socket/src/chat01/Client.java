package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws IOException {
//		소켓
		Socket socket = null;
		
//		출력스트림 PrintWriter
		PrintWriter writer = null;
		String serverIp = "";
		
		try {
			
//			서버 연결 완료
			socket = new Socket(serverIp, 1100); // Ip, 포트번호 묶어주기
			System.out.println("서버가 연결되었습니다.");
			
//			서버로 데이터를 전송하기 위한 PrintWriter 생성
			writer = new PrintWriter(socket.getOutputStream(), true);
			
			String message = "안녕! 나는 클라이언트 😎";
			
//			메세지 전송
			writer.println(message);
			System.out.println("서버로 [" + message + "]라는 메세지를 보냈습니다.");
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(socket != null) {
				socket.close();
			}
			if(writer != null) {
				writer.close();
			}
			
		}
		
	}

}
