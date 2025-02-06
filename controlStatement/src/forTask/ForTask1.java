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
//		int result2 = 0;
//		Scanner sc = new Scanner(System.in);
//		String message = "n값을 입력하세요.";
//		System.out.println(message);
//		int n = sc.nextInt();
//		for(int i = 0; i <= n; i ++) {
//			result2 += i;
//		}
//		System.out.println("결과 : " + result2);
      
//      플레티넘
//      A~F까지 출력하기
//		char i = 'A';
//		for(int i = 65; i <= 70; i++) {
//			i = (char)i;
//		}
//		System.out.println(i);
		
//		char a = 'A';
//		for(int i = 0; i < 6; i++) {
//			System.out.println((char)(a + i));
//		}
		
		for(char c = 'A'; c <= 'F'; c++) {
			System.out.println(c);
		} 
		
//      A~F까지 중 C를 제외하고 출력하기
		for(char c = 'A'; c <= 'F'; c++) {
			if (c == 'C') { continue; }
			System.out.println(c);
		}

		
//      다이아
//      012340123401234 출력하기
//		int num = 01234;
//		for(int i = 0; i < 3; i++) {
//			for (int j = 0; j < 5; j ++)
//			System.out.print(j);
//		}
		
//      aBcDeF...Z까지 출력하기		
		for(char c = 'a'; c <= 'z'; c++) {
			if(c % 2 == 1) {
				System.out.print(c);
			}
		}
		
		for(char c = 'A'; c <= 'Z'; c++) {
			if(c % 2 == 0) {
				System.out.print(c);
			}
		}
		
		
//		for(char c1 = 'a'; c1 <= 'z'; c1++) {
//			for(char c2 ='A'; c2 <= 'Z'; c2++ )
//				System.out.println(c2);
//		}
//		for(char c = 'a'; c <= 'z'; c++) {
//			if(c % 2 == 1) {
//				System.out.print(c);
//				}
//			}

		
//      
//      마스터
//      별찍기

//       *
//      ***
//     *****
//    *******
//   *********
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.println("");
			}
		}


		
	}

}


//        int n = 5;  // 출력할 줄 수
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


