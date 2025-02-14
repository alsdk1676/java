package inputTask;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//	두 정수를 입력한 뒤 덧셈 결과를 출력한다.
//	단, sc.next()만 사용한다.
		
//		review
		int num1 = 0, num2 = 0, result = 0;
		String message1 = "첫 번째 정수를 입력하세요.", message2 = "두 번째 정수를 입력하세요.", resultMessage1 = "%d", resultMessage2 = "%d + %d = %d";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(message1);
		num1 = Integer.parseInt(sc.next());
		System.out.println(message2);
		num2 = Integer.parseInt(sc.next());
		result = num1 + num2;
		System.out.printf("결과 : " + resultMessage1, result);
		System.out.printf("\n결과 : " + resultMessage2, num1, num2, result);
		
	
//		==================================================================
//		int num1 = 0, num2 = 0, result = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		String message1 = "첫 번째 정수를 입력하세요.";
//		String message2 = "두 번째 정수를 입력하세요.";
//		String resultMessage = "%d + %d = %d\n";
//		
//		System.out.printf(message1);
//		num1 = Integer.parseInt(sc.next());
//		System.out.printf(message2);
//		num2 = Integer.parseInt(sc.next()); //sc.next() : 통째로 문자열값
//		
//		result = num1 + num2;
////		System.out.println("덧셈 결과 : " + result);
//		System.out.printf("덧셈 결과 : " + resultMessage, num1, num2, result);
	}

}
