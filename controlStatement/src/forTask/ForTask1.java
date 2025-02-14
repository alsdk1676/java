package forTask;

import java.util.Scanner;

public class ForTask1 {
	public static void main(String[] args) {
//      브론즈
//      1~100까지 출력하기
		for(int i = 0; i < 100; i++) {
			System.out.println(i + 1);
		}
		
//      100~1까지 출력하기
		for(int i = 0; i < 100; i++) {
			System.out.println(100 - i);
		}
		
//      1~100까지 중 짝수만 출력하기
        for (int i = 1; i <= 100; i++) {
        	if (i % 2 == 0) {
        		System.out.println(i);
        	}
		}
      
//      골드
//      1~10까지의 합을 출력하기
        int result = 0;
		for(int i = 0; i <= 10; i++) {
			result += i;
		}
		System.out.println(result);
		
//      1~n까지의 합을 출력하기
//		int result2 = 0, n = 0;
//		Scanner sc = new Scanner(System.in);
//		String message = "정수 n값을 입력하세요.";
//		System.out.println(message);
//		
//		n = sc.nextInt();
//		for(int i = 0; i <= n; i++) {
//			result2 += i;
//		}
//		System.out.println("결과 : " + result2);
		
      
//      플레티넘
//      A~F까지 출력하기
//		A = 65
//		a = 97
		for(int i = 65; i < 71; i++) {
			System.out.print((char)i);
		}

//		강사님 풀이
//		char a = 'A';
//		for(int i = 0; i < 6; i++) {
//			System.out.print((char)(a + i));
//		}

		
//      A~F까지 중 C를 제외하고 출력하기
		for(char c = 'A'; c <= 'F'; c++) {
			if (c == 'C') { continue; }
			System.out.println(c);
		}
		
//		for(int i = 65; i < 71; i++) {
//			if(i == 67) { continue; }
//			System.out.print((char)i);
//		}

//		강사님 풀이
//		for(int i = 0; i < 5; i++) {
//		System.out.print(i > 1 ? (char)(a + 1 + i) : (char)(a + i));
//	}
		
//      다이아
//      012340123401234 출력하기
//		내 풀이
//		int num = 01234;
//		for(int i = 0; i < 3; i++) {
//			for (int j = 0; j < 5; j ++)
//			System.out.print(j);
//		}
//
//		for(int i = 0; i < 5; i++) {
//			 System.out.print(i); // 01234
//		}
		
//		강사님 풀이
//		for(int i = 0; i < 15; i++) {
//		System.out.print(i % 5);
//	}
		
		
//      aBcDeF...Z까지 출력하기

//		강사님 풀이
//		int gap = 'a' - 'A';
//		for(int i = 0; i < 26; i++) {
//			System.out.print(i % 2 == 0 ? (char)(a + gap + i) : (char)(a + i));
//		}

		
//      
//      마스터
//      별찍기

//       *
//      ***
//     *****
//    *******
//   *********
		
		
	}

}


//        int n = 5;  // 출력할 줄 수
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.pr\int(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


