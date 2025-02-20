package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
	
//	throws는 해당 메소드를 사용한 쪽으로 예외를 발생시킨다.
//	따라서 메소드 내에서는 throws에 작성한 예외가 발생하지 않는다.
	
	public static void main(String[] args) throws IOException { // 사용하는 쪽에서 처리하도록 겅재
//		Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
//		System.out.println("입력");
//		sc.next();
//		sc.close();
//		new FileWriter(경로, 이어쓰기 여부(내용삭제X));
//		try {
////			열고 쓰고 닫기
////			
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true)); // 드라이버때문에 try-catch 강제, true 적어야지 내용 append
//			bufferedWriter.write("서민아 !!");
//			bufferedWriter.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
////		} finally { // 오류가 발생하더라도 무조건 close 필요
////			bufferedWriter.close();
////		}
//		}
		
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader("test.txt"));
//			String line = bufferedReader.readLine();
			String line = null;
//			모든 줄을 가져오려면 while문 : 몇 문장이 있는지 모르기 때문
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
//			System.out.println(line);
			
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로입니다.");
			e.printStackTrace();
		} finally {
				bufferedReader.close();
		}
		
		
		
	}

}
