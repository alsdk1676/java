package arrayTask;

import java.util.Scanner;

public class ArrayTaskReview1 {
	public static void main(String[] args) {
//		25분
	      
//    	브론즈
//    	10~1까지 중 짝수만 배열에 담고 출력
		int[] arData1 = new int[10];
		for(int i = 0; i < arData1.length; i++) {
			if(i % 2 == 1) {
				arData1[i] = 10 - i;
//				System.out.println(arData1[i]);
			}
		}
		
//    	1~10까지 배열에 담고 출력
		int[] arData2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < arData2.length; i++) {
//			System.out.println(arData2[i]);
		}

//    	1~100까지 배열에 담은 후 홀수만 출력
		int[] arData3 = new int[100];
		for(int i = 0; i < arData3.length; i++) {
			arData3[i] = i + 1;
			if(arData3[i] % 2 == 1) {
//				System.out.println(arData3[i]);
			}
		}
 
//    	실버
//    	1~100까지 배열에 담은 후 짝수의 합 출력
		int result = 0;
		int[] arData4 = new int[100];
		for(int i = 0; i < arData4.length; i++) {
			arData4[i] = i + 1;
			if(arData4[i] % 2 == 0) {
				result += arData4[i];
			}
		}
//		System.out.println(result);
			
//    	A~F까지 배열에 담고 출력
		char c = 'A'; // 65
		char[] arData5 = new char[6];
		for(int i = 0; i < 6; i++) {
			arData5[i] = (char)(c + i);
//			System.out.println(arData5[i]);
		}

	
//    	A~F까지 중 C를 제외하고 배열에 담은 후 출력
		char ch = 'A'; // 65
		char[] arData6 = new char[5];
		for(int i = 0; i < arData6.length; i++) {
			arData6[i] = (char)(i > 1 ? ch + i + 1 : ch + i);
//			System.out.println(arData6[i]);
		}

//		
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최댓값과 최솟값을 출력하기
		Scanner sc = new Scanner(System.in);
//		String message = "5개의 정수를 입력하세요.", resultMessage = "%d %d %d %d %d\n";
//		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, max = 0, min = 0;
//		System.out.println(message);
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		num4 = sc.nextInt();
//		num5 = sc.nextInt();
//		
//		System.out.printf("입력한 5개 정수 : " + resultMessage , num1, num2, num3, num4, num5);
//		int[] arData7 = {num1, num2, num3, num4, num5};
//		
//		max = arData7[0];
//		min = arData7[0];
//		
//		for(int i = 0; i < arData7.length; i++) {
//			System.out.println(arData7[i]);
//			if(arData7[i] > max) {
//				max = arData7[i];
//			} if(arData7[i] < min) {
//				min = arData7[i];
//			}
//		}
//		System.out.println("최댓값 : " + max + " 최솟값 : " + min);
		
		

//		다이아
//		사용자가 입력한 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균값을 구하기
		String message2 = "입력할 정수의 개수 : ", message3 = "정수를 입력하세요.";
		int count = 0, total = 0;
		double avg = 0.0;
		System.out.println(message2);
		count = sc.nextInt();
		int[] arData8 = new int[count];

		System.out.println(message3);
		for(int i = 0; i < count; i++) {
			arData8[i] = sc.nextInt();
//			System.out.println(arData8[i]);
		}
		
		for(int i = 0; i < count; i++) {
			total += arData8[i];
		}
		avg = total / count;
		System.out.println("평균 : " + avg);
	}

}
