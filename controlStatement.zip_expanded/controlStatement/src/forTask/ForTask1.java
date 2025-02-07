package forTask;

import java.util.Scanner;

public class ForTask1 {
	public static void main(String[] args) {
//		브론즈
//		1~100까지 출력하기
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i + 1);
//		}
		
		
//		100~1까지 출력하기
//		for(int i = 0; i < 100; i++) {
//			System.out.println(100 - i);
//		}
		
		
//		1~100까지 중 짝수만 출력하기
//		for(int i = 0; i <= 100; i++) {
//			if(i == 0) { continue; }
//			if(i % 2 == 0) { System.out.println(i); }
//		}
		
//		for(int i = 0; i <= 50; i++) {
//			if(i == 0) { continue; }
//			System.out.println(i * 2);
//		}
		
//		골드
//		1~10까지의 합을 출력하기
//		int result = 0;
//		for(int i = 0; i < 10; i++) {
//			result += i + 1;
//		}
//		
//		System.out.println(result);
		
//		1~n까지의 합을 출력하기
//		Scanner sc = new Scanner(System.in);
//		int count = 0, result2 = 0;
//		
//		count = sc.nextInt();
//		for(int i = 0; i <= count; i++) {
//			result2 += i;
//		}
//		
//		System.out.println(result2);
		
//		플레티넘
		// A : 65
		// a : 97
		// 26개
		
//		A~F까지 출력하기
		char a = 'A';
//		for(int i = 0; i < 6; i++) {
//			System.out.print((char)(a + i));
//		}
		
//		A~F까지 중 C를 제외하고 출력하기
//		for(int i = 0; i < 5; i++) {
//			System.out.print(i > 1 ? (char)(a + 1 + i) : (char)(a + i));
//		}
		
//		다이아
//		012340123401234 출력하기
//		for(int i = 0; i < 15; i++) {
//			System.out.print(i % 5);
//		}
		
//		aBcDeF...Z까지 출력하기
		int gap = 'a' - 'A';
		for(int i = 0; i < 26; i++) {
			System.out.print(i % 2 == 0 ? (char)(a + gap + i) : (char)(a + i));
		}
		
//		마스터
//		별찍기
//		 *
//		***
//	   *****
//    *******
//   *********
        int n = 5; // 줄 개수

        for (int i = 0; i < n; i++) {
            // 공백 출력 (오른쪽 정렬)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // 별 출력 (홀수 개)
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
		
	}
}
