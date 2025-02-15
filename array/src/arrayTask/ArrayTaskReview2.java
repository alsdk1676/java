package arrayTask;

import java.util.Scanner;

public class ArrayTaskReview2 {
	public static void main(String[] args) {
		
//		1) 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//	    대문자는 모두 소문자로 변경한다.

//	    .charAt()
//	    단 문자열의 메서드는 사용하지 않는다.
//	      
//	    입력 예) 안녕hI!!
//	   	출력 예) 안녕Hi!!

		Scanner sc = new Scanner(System.in);
//		String message1 = "문자열을 입력하세요.", inputStr = null, result = "";
//		int length = 0;
//		
//		System.out.println(message1);
//		inputStr = sc.next();
//		
//		for(int i = 0; i < inputStr.length(); i++) {
//			if(inputStr.charAt(i) >= 65 && inputStr.charAt(i) <= 90) {
//				result += (char)(inputStr.charAt(i) + 32);
//			} else if(inputStr.charAt(i) >= 98 && inputStr.charAt(i) <= 122) {
//				result += (char)(inputStr.charAt(i) - 32);
//			} else {
//				result += inputStr.charAt(i);
//			}
//		}
//		System.out.println(result);


		
//		2) 정수를 한글로 변경
//		입력 값을 배열에 담고 정수를 한글로 변경
//	    입력 예) 1024
//	    출력 예) 일공이사
//		String message2 = "정수를 입력하세요.";
//		int length = 0, num = 0;
//		String input = null, result2 = "", hangles = "공일이삼사오육칠팔구";;
//		String[] inputArray = new String[length];
//		
////		사용자에게 정수 입력받기
////		정수 String으로 받아서 charAt() 사용!!
//		System.out.println(message2);
//		input = sc.next();
////		System.out.println(input); // 1024
////		System.out.println(input.charAt(0)); // 1
////		System.out.println(hangles.charAt(0)); // 공
//		
//		for(int i = 0; i < input.length(); i++) {
////			System.out.println(input.charAt(i));
////			System.out.println(hangles.charAt(i));
//			num = input.charAt(i) - '0';
//			result2 += hangles.charAt(num);
//		}
//		System.out.println(result2);
			

//	      3) 문자열과 찾을 문자를 입력받고
//	      문자열에서 문자의 개수를 찾기
//	      예시) 입력: content cc!
//	          찾을문자 : c
//	          c의 개수 3개
		String message3 = "문자열을 입력하세요.", message4 = "찾을 문자 : ", resultMessage = "의 개수 : ", inputStr = null;
		char findChar = ' ';
		int count = 0;
		System.out.println(message3);
		inputStr = sc.nextLine();
		System.out.println(message4);
		findChar = sc.next().charAt(0);
		
		for(int i = 0; i < inputStr.length(); i++) {
			if(findChar == inputStr.charAt(i)) {
				count++;
			}
		}
		System.out.println(findChar + resultMessage + count + "개");


	}
}
