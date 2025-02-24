package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client03 {
	public static void main(String[] args) throws IOException{
		BufferedWriter in = null;
		BufferedReader out = null;
		Socket clientSocket = null;
		Scanner sc = new Scanner(System.in);
		String serverIp = "localhost";
		
		try {
			clientSocket = new Socket(serverIp, 7777);
			System.out.println("연결 완료");
			
			BufferedReader in = new Input
			
		}
		
	}

}
