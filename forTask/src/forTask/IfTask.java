package forTask;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		
//		문제 1:
//		사용자가 입력한 숫자가 100 이상인지 100 미만인지를 판별하는 프로그램을 작성해 보세요.
//		100 이상이면 "100 이상입니다."를 출력하고,
//		100 미만이면 "100 미만입니다."를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
//		int input = 0;
//		String message = "정수를 입력하세요.";
//		System.out.println(message);
//		input = sc.nextInt();
//		
//		if(input >= 100) {
//			System.out.println("100 이상입니다.");
//		} else {
//			System.out.println("100 미만입니다.");
//		}
	
	
//		문제 2:
//		사용자가 입력한 나이에 따라 적합한 영화 등급을 출력하는 프로그램을 작성해 보세요.
//		나이가 18세 이상이면 "성인 영화 관람 가능"을 출력하고,
//		나이가 13세 이상 18세 미만이면 "청소년 영화 관람 가능"을 출력하고,
//		나이가 13세 미만이면 "어린이 영화 관람 가능"을 출력하세요.
//		int age = 0;
//		String message2 = "나이를 입력하세요.";
//		System.out.println(message2);
//		age = sc.nextInt();
//		
//		if(age >= 18) {
//			System.out.println("성인 영화 관람 가능");
//		} else if (age >= 13) {
//			System.out.println("청소년 영화 관람 가능");
//		} else {
//			System.out.println("어린이 영화 관람 가능");
//		}
		
//		문제 3:
//		사용자가 입력한 성적을 바탕으로 학점을 출력하는 프로그램을 작성해 보세요.
//		90점 이상이면 "A"를 출력하고,
//		80점 이상 90점 미만이면 "B"를 출력하고,
//		70점 이상 80점 미만이면 "C"를 출력하고,
//		60점 이상 70점 미만이면 "D"를 출력하고,
//		60점 미만이면 "F"를 출력하세요.
		int score = 0;
		String message3 = "점수를 입력하세요.";
		System.out.println(message3);
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
//		문제 4:
//		사용자가 입력한 두 숫자 중 더 큰 값을 출력하는 프로그램을 작성해 보세요.
//		두 숫자 중 더 큰 숫자를 출력하세요.
		
//		문제 5:
//		사용자가 입력한 숫자가 3의 배수인지 5의 배수인지를 판별하는 프로그램을 작성해 보세요.
//
//		3의 배수이면 "3의 배수입니다."를 출력하고,
//		5의 배수이면 "5의 배수입니다."를 출력하고,
//		3의 배수도 5의 배수도 아니면 "3의 배수도, 5의 배수도 아닙니다."를 출력하세요.
	

	}
}
