package anonymousTest;

// 가입 양식
// 메뉴 받기, 판매
public interface Form {
//	추상 메서드 2개
	public String[] getMenus();
	public void sell(String menu);
	public void isFree(String menu);

}


package exceptionTask;

import java.util.Scanner;

public class ExceptionTask {
    public static void main(String[] args) {
        int[] arData = new int[5];
        int count = 0;
        String message = "정수 5개를 순서대로 입력하세요.";
        Scanner sc = new Scanner(System.in);
        
        System.out.println(message);
        while(count < arData.length) {
            System.out.println((count + 1) + " 번 째 정수 (종료하려면 q를 입력하세요):");
            String input = sc.next();
            
            if (input.equals("q")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            try {
                arData[count] = Integer.parseInt(input);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
            }
        }
        
        sc.close();
        
        // 배열에 담긴 정수 출력
        System.out.print("입력된 정수: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arData[i] + " ");
        }
    }
}
//
//package exceptionTask;
//
//import java.util.Scanner;
//
//public class ExceptionTask {
//    public static void main(String[] args) {
//        int[] arData = new int[5];
//        int count = 0;
//        String message = "정수 5개를 순서대로 입력하세요.", exampleMessage = " 번 째 정수 (종료하려면 q를 입력하세요):";
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println(message);
//        while(count < arData.length) {
//            System.out.println((count + 1) + exampleMessage);
//            String expression = sc.next();
//            
//            if(expression.equals("q")) {
//                System.out.println("종료");
//                break;
//            }
//            
//            try {
//                arData[count] = Integer.parseInt(expression);
//                count++;
//            } catch (NumberFormatException e) {
//                System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
//            }
//        }
//        
//        sc.close();
//        
//        // 배열에 담긴 정수 출력
//        System.out.print("입력된 정수: ");
//        for (int i = 0; i < count; i++) {
//            System.out.print(arData[i] + " ");
//        }
//    }
//}


