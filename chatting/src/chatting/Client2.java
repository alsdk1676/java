package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

class ClientThread extends Thread {
	private BufferedReader input;
	
	public ClientThread(BufferedReader input) {
		this.input = input;
	}
	
	@Override
	public void run() {
		String line;
		try {
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(input != null) {
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Client {
	public static void main(String[] args) throws IOException {
		String name = "mina";
		String ip = "";
//		Socket socket = null;
//		PrintWriter output = null;
//		BufferedReader input = null;
//		BufferedReader keyInput = null;
		
//		try-with-resources
		try (
				Socket socket = new Socket(ip, 8000);
				PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true); // true : auto Flush
				BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedReader keyInput = new BufferedReader(new InputStreamReader(System.in)); // 내가 입력
			) {
//			socket = new Socket(ip, 8000);
//			output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true); // true : auto Flush
//			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			keyInput = new BufferedReader(new InputStreamReader(System.in)); // 내가 입력
			
			System.out.println("서버와 연결되었습니다.");
			
//			서버로부터 들어오는 메세지를 처리하는 메서드
			ClientThread clientThread = new ClientThread(input);
			clientThread.start();
			
			String line;
			while((line = keyInput.readLine()) != null) {
				output.println(name + " : " + line);
			}
			
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
//		finally {
//			if(socket != null) {
//				socket.close();
//			}
//			if(input != null) {
//				input.close();
//			}
//			if(output != null) {
//				output.close();
//			}
//			if(keyInput != null) {
//				keyInput.close();
//			}
//		}
		
	}
	

}
