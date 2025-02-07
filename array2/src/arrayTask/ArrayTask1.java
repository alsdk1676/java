package arrayTask;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
//      25분
	      
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
		int[] arr1 = new int[10];
		for(int i = 0; i < arr1.length; i++) {
			if(i % 2 == 0) {
				arr1[i] = 10 - i;
//				System.out.println(arr1[i]);
			}
		}

//      1~10까지 배열에 담고 출력
		int[] arr2 = new int[10];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i + 1;
//			System.out.println(arr2[i]);
		}
		
//      1~100까지 배열에 담은 후 홀수만 출력
		int[] arr3 = new int[100];
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = i + 1;
			if(i % 2 == 0) {
//				System.out.println(arr3[i]);
			}
		}

      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
		int[] arr4 = new int[100];
		int result = 0;
		
		for(int i = 0; i < 100; i++) {
			arr4[i] = i + 1; // arr4 
//			System.out.println(arr4[i]);
			if(i % 2 == 1) {continue;}
			result += arr4[i];
		}
//		System.out.println(result);


			
//      A~F까지 배열에 담고 출력
		char[] arr5 = new char[6];
//		char a = 'A'
		for(int i = 0; i < arr5.length; i++) {
			arr5[i] = (char)(65 + i);
//			System.out.print(arr5[i]);
		}
		
		
//      A~F까지 중 C를 제외하고 배열에 담은 후 출력
		char[] arr6 = new char[5];
		for(int i = 0; i < arr6.length; i++) {
			arr6[i] = (char)(i > 1 ? 65 + i + 1 : 65 + i);
//			System.out.print(arr6[i]);
		}
		
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최댓값과 최솟값을 출력하기
		
//		5개의 정수 입력 메세지를 띄운다.
//		5개의 정수를 입력한다.
//		5개의 정수를 담은 배열 만든다.
//		5개의 정수 중 최댓값과 최솟값 구한다.
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
//		String message = "5개의 정수를 입력하세요.\nex) 10 20 30 40 50", resultMessage = "%d %d %d %d %d\n";
//		System.out.println(message);
//		
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		num4 = sc.nextInt();
//		num5 = sc.nextInt();
//		
//		System.out.printf(resultMessage, num1, num2, num3, num4, num5); // 10, 20, 30, 40, 50 입력값 출력
//		int[] arData = {num1, num2, num3, num4, num5}; 
//		for(int i = 0; i < arData.length; i++) {
//		System.out.println(arData[i]); // 배열 출력
//		}
		
//		강사님 풀이
//		int[] arData7 = new int[5];
//		int min = 0, max = 0;
//		Scanner sc = new Scanner(System.in);
//		String message = "5개의 정수를 입력하세요", exampleMessage = "1 3 5 7 9";
//		
//		System.out.println(message);
//		System.out.println(exampleMessage);
//		
//		for(int i = 0; i < arData7.length; i++) {
//			arData7[i] = sc.nextInt();
//		}
//
//		min = arData7[0];
//		max = arData7[0];
//		
//		for(int i = 1; i < arData7.length; i++) {
//			if(max < arData7[i]) { max = arData7[i]; };
//			if(min > arData7[i]) { min = arData7[i]; };
//		}
//		
//		System.out.println("최솟값 : " + min + "\n최댓값 : " + max);
		
		
		
	
//		다이아
//		사용자가 입력한 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균값을 구하기
//		Scanner sc = new Scanner(System.in);.
		
		Scanner sc = new Scanner(System.in);
		int[] arData = null;
		int length = 0, total = 0;
		double average = 0.0;
		String message1 = "정수의 개수: ", message2 = "입력한 모든 정수 :", message3 = "평균 : ";
		
		System.out.println(message1);
		length = sc.nextInt();
		arData = new int[length];
		
		for(int i = 0; i < arData.length; i++) {
			System.out.println(i + 1 + "번째 정수: ");
			arData[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		
		average = (double)total / length;

		System.out.println(message2);
		for(int i = 0; i < arData.length; i++) {
			System.out.println("[" + (i + 1) + "번 째 정수: " + arData[i] + "]" );
		}
		System.out.println(message3 + average);
		
	}

}


//public class NumberToKorean {
//    public static void main(String[] args) {
//        int number = 1024;
//        String[] koreanNumbers = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
//        
//        // 숫자를 문자열로 변환
//        String numberStr = String.valueOf(number);
//        StringBuilder result = new StringBuilder();
//
//        // 문자열의 각 문자를 한글로 변환
//        for (int i = 0; i < numberStr.length(); i++) {
//            char digit = numberStr.charAt(i);
//            int digitValue = Character.getNumericValue(digit);
//            result.append(koreanNumbers[digitValue]);
//        }
//        
//        System.out.println("변환된 숫자: " + result.toString());
//    }
//}


//public class ChangeCase {
//    public static void main(String[] args) {

//        String input = "Hello, World!";
//        

//        char[] charArray = input.toCharArray();
//

//        for (int i = 0; i < charArray.length; i++) {
//            // Check if the character is lowercase
//            if (Character.isLowerCase(charArray[i])) {
//                // Convert to uppercase
//                charArray[i] = Character.toUpperCase(charArray[i]);
//            } 

//            else if (Character.isUpperCase(charArray[i])) {

//                charArray[i] = Character.toLowerCase(charArray[i]);
//            }
//        }
//
//        // Convert the character array back to a string
//        String output = new String(charArray);
//
//        // Print the result
//        System.out.println("Converted string: " + output);
//    }
//}

