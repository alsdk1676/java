package inputTask;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 뒤
//		3개의 정수의 곱셈을 출력한다.
//		단, sc.next()만 사용
		
//		review1 (3개 정수 각각 받기)
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0, num2 = 0, num3 = 0, result = 0, input = 0;
//		String message = "3개의 정수를 입력하세요.", resultMessage = "%d * %d * %d = %d";
//		
//		System.out.println(message);
//		num1 = Integer.parseInt(sc.next());
//		num2 = Integer.parseInt(sc.next());
//		num3 = Integer.parseInt(sc.next());
//		result = num1 * num2 * num3;
//		
//		System.out.printf("결과 : " + resultMessage, num1, num2, num3, result);
//			
//		}

//		review2 (한번에 받아서 결과 출력)
//		Scanner sc = new Scanner(System.in);
//		int result = 1;
//		String input = null;
//		String message = "3개의 정수를 입력하세요.\nex)10, 20, 30";
//		String[] inputArray = null;
//
//		
//		System.out.println(message);
//		input = sc.nextLine();
//		
//		inputArray = input.replaceAll(" ", "").split(","); // 10 20 30
//		
//		result = 1;
//		for(String i : inputArray) {
//			result *= Integer.parseInt(i);
//			}
//		System.out.println(result);
//	}
	
	
//		review3
		Scanner sc = new Scanner(System.in);
		String input = null, message = "3개의 정수를 입력하세요.\nex)10 20 30";
		String[] inputArray = null;
		int result = 1;
		
		System.out.println(message);
		input = sc.nextLine();
		
		inputArray = input.split(" ");
		
		result = 1;
		for(String i : inputArray) {
			result *= Integer.parseInt(i);
			}
		System.out.println(result);
		}
		
		
//		=====================================================================
//		Scanner sc = new Scanner(System.in);
//		int num1 = 0, num2 = 0, num3 = 0, result = 0;
//		
//		String message = "정수 3개를 입력하세요.";
//		System.out.println(message);
//		String resultMessage = "%d * %d * %d = %d\n";
//		
////		num1 = Integer.parseInt(sc.next());
////		num2 = Integer.parseInt(sc.next());
////		num3 = Integer.parseInt(sc.next());
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		result = num1 * num2 * num3;
//		
//		System.out.printf("곱셈 결과 : " + resultMessage, num1, num2, num3, result);
	
}
