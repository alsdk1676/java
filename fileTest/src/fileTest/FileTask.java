package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileTask {


	public static void main(String[] args) throws IOException {
//		음식을 4개 출력(Writer)
//		음식을 모두 가져와서 콘솔에 출력
//		값을 수정하기
//		햄버거 삭제
		String[] foods = {"햄버거", "떡볶이", "김밥", "라면"};
		
		
//				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods.txt", true));
//				
////				for(int i = 0; i < foods.length; i++) {
////					bufferedWriter.write(foods[i] + " ");
////				}
//
//				Arrays.asList(foods).stream().forEach(food -> {
//					try {
//						bufferedWriter.write(food + "\n");
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				});
//				
//				bufferedWriter.close();
//				
		
			
			BufferedReader bufferedReader = null;
			
			try {
				bufferedReader = new BufferedReader(new FileReader("foods.txt"));
				String temp = "";
				String line = null;
				while((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				System.out.println("경로를 찾을 수 없습니다.");
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
//				bufferedReader.close();
			}
			
			bufferedReader = new BufferedReader(new FileReader("foods.txt"));
			String line = null;
			String temp = "";
			
//			값을 수정하기
//			while((line = bufferedReader.readLine()) != null) {
//				if(line.equals("김밥")) { // 삭제한 후 새로운 파일로 덮어쓰기
//					temp += "부대찌개\n";
//					continue;
//				}
//				temp += line + "\n";
//			}
//			bufferedReader.close();
//			
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods.txt")); // true가 없으니까 덮어쓰기
//			bufferedWriter.write(temp);
//			bufferedWriter.close();
			
//			햄버거 삭제
			while((line = bufferedReader.readLine()) != null) {
				if(line.equals("햄버거")) {
					continue;
				}
				temp += line + "\n";
			}
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods.txt")); // true가 없으니까 덮어쓰기
			bufferedWriter.write(temp);
			bufferedWriter.close();
			
	}

}
