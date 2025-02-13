package chatting;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("상대방에게 보내는 메세지 : ");
		try {
			
			message = sc.nextLine(); // 예외 발생시킬 수 있는 코드, 메시지 입력
			if(message.contains("바보")) { //  메세지 검사
//			throw new RuntimeException("비속어 사용하자마!!!!!!!!");
				throw new BadWordException("비속어 사용하자마!!!!!!!!");
			}
			
			System.out.println(message); // 예외 발생시킬 수 있는 코드
			
			
		} catch (BadWordException e) {
			System.out.println("비속어는 사용할 수 없습니다!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
