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
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
		String message = "5개의 정수를 입력하세요.\nex) 10 20 30 40 50", resultMessage = "%d %d %d %d %d\n";
		System.out.println(message);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
		
		System.out.printf(resultMessage, num1, num2, num3, num4, num5); // 10, 20, 30, 40, 50 입력값 출력
		int[] arData = {num1, num2, num3, num4, num5}; 
		for(int i = 0; i < arData.length; i++) {
		System.out.println(arData[i]); // 배열 출력
		}
		
		
		
	
//		다이아
//		사용자가 입력한 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균값을 구하기
//		Scanner sc = new Scanner(System.in);
		int[] arData2 = null;
		int length = 0, total = 0;
		double average = 0.0;
		String message1 = "정수의 개수 : ", message2 = "입력한 모든 정수 : ", message3 = "평균 : ";
		
		System.out.println(message1);
		length = sc.nextInt();
		arData = new int[length];
		
		for(int i = 0; i < arData.length; i++) {
			System.out.println(i + "번 째 정수 : ");
			arData[i] = sc.nextInt();
//			System.out.println(arData[i]);
		}
		for(int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		average = (double)total / length; // 실수 나누기 정수는 실수이기 때문에 괄호 필요없음
		System.out.println(total);
		System.out.println(average);
		
		System.out.println(message2);
		for(int i = 0; i < arData.length; i++) {
			System.out.println("[" + (i + 1) + "번 째 정수" + arData[i] + "]");
		}
		System.out.println(message3 + average);
		
	}

}


