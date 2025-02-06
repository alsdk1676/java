package inputTask;

import java.util.Scanner;

public class InputTast2 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 뒤
//		3개의 정수의 곱셈을 출력한다.
//		단, next()만 사용
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
		String message = "정수 3개를 입력하세요.";
		System.out.println(message);
		String resultMessage = "%d * %d * %d = %d\n";
		
//		num1 = Integer.parseInt(sc.next());
//		num2 = Integer.parseInt(sc.next());
//		num3 = Integer.parseInt(sc.next());
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		result = num1 * num2 * num3;
		
		System.out.printf("곱셈 결과 : " + resultMessage, num1, num2, num3, result);
	}
}
