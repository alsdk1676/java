package methodTask;

import java.util.Scanner;

public class MethodTask2 {
//	이름을 n번 출력하는 메서드, 이름을 n번만큼 출력해주는 프로그램
	void printNameFromToCount(String name, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(name); // return 타입 없음
		}
	}
	public static void main(String[] args) {
		MethodTask2 mt2 = new MethodTask2(); // 클래스 가져오기
		Scanner sc = new Scanner(System.in);
		String name = null, message1 = "이름을 입력하세요.", message2 = "이름을 몇 번 출력 하시겠습니까?\nex)5";
		int count = 0;
		
		System.out.println(message1); // 입력받기 전에 출력부터
		name = sc.next(); // 받은 입력값 name에 넣기
		System.out.println(message2);
		count = sc.nextInt();
		
		mt2.printNameFromToCount(name, count);
	}
	

}

//public class DivisionCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the dividend: ");
//        int dividend = scanner.nextInt();
//        
//        System.out.print("Enter the divisor: ");
//        int divisor = scanner.nextInt();
//        
//        int[] result = divide(dividend, divisor);
//        System.out.println("Quotient: " + result[0]);
//        System.out.println("Remainder: " + result[1]);
//    }
//
//    static int[] divide(int dividend, int divisor) {
//        int[] result = new int[2];
//        result[0] = dividend / divisor; // 몫
//        result[1] = dividend % divisor; // 나머지
//        return result;
//    }
//}

//import java.util.Scanner;
//
//public class IndexValueFinder {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[5];
//
//        System.out.println("5개의 정수를 입력하세요:");
//        for (int i = 0; i < 5; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//
//        System.out.println("찾고 싶은 값을 입력하세요:");
//        int value = scanner.nextInt();
//
//        int index = indexOf(numbers, value);
//        if (index != -1) {
//            System.out.println("값 " + value + "의 인덱스: " + index);
//        } else {
//            System.out.println("값 " + value + "는 배열에 존재하지 않습니다.");
//        }
//    }
//
//    public static int indexOf(int[] array, int value) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value) {
//                return i;
//            }
//        }
//        return -1; // 값이 배열에 없는 경우
//    }
//}

//import java.util.HashMap;
//
//public class HangulToNumber {
//    // 한글 숫자와 대응하는 숫자를 저장하는 매핑
//    private static final HashMap<String, Integer> hangulToNumber = new HashMap<>();
//    static {
//        hangulToNumber.put("공", 0);
//        hangulToNumber.put("일", 1);
//        hangulToNumber.put("이", 2);
//        hangulToNumber.put("삼", 3);
//        hangulToNumber.put("사", 4);
//        hangulToNumber.put("오", 5);
//        hangulToNumber.put("육", 6);
//        hangulToNumber.put("칠", 7);
//        hangulToNumber.put("팔", 8);
//        hangulToNumber.put("구", 9);
//    }

    // 한글 문자열을 정수로 변환하는 메소드
//    public static int hangulToInteger(String hangul) {
//        StringBuilder numberStr = new StringBuilder();
//        for (int i = 0; i < hangul.length(); i++) {
//            String hangulDigit = String.valueOf(hangul.charAt(i));
//            if (hangulToNumber.containsKey(hangulDigit)) {
//                numberStr.append(hangulToNumber.get(hangulDigit));
//            } else {
//                throw new IllegalArgumentException("Invalid Hangul digit: " + hangulDigit);
//            }
//        }
//        return Integer.parseInt(numberStr.toString());
//    }
//
//    public static void main(String[] args) {
//        String hangulNumber = "일공이사"; // 예시 입력
//        int result = hangulToInteger(hangulNumber);
//        System.out.println("변환된 숫자: " + result);
//    }
//}

//
//public class HangulToNumber {
//    // 한글 숫자와 대응하는 숫자를 저장하는 매핑
//    private static final String[] HANGUL_NUMBERS = {"공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
//
//    // 한글 문자열을 정수로 변환하는 메소드
//    public static int hangulToInteger(String hangul) {
//        StringBuilder numberStr = new StringBuilder();
//        for (int i = 0; i < hangul.length(); i++) {
//            char hangulChar = hangul.charAt(i);
//            boolean found = false;
//            for (int j = 0; j < HANGUL_NUMBERS.length; j++) {
//                if (HANGUL_NUMBERS[j].equals(String.valueOf(hangulChar))) {
//                    numberStr.append(j);
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                throw new IllegalArgumentException("Invalid Hangul digit: " + hangulChar);
//            }
//        }
//        return Integer.parseInt(numberStr.toString());
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("한글 숫자를 입력하세요: ");
//        String hangulNumber = scanner.nextLine();
//        int result = hangulToInteger(hangulNumber);
//        System.out.println("변환된 숫자: " + result);
//        scanner.close();
//    }
//}

//import java.util.Scanner;

//public class HangulToNumber {
//    // 한글 숫자와 대응하는 숫자를 저장하는 매핑
//    private static final String[] HANGUL_NUMBERS = {"공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
//
//    // 한글 문자열을 정수로 변환하는 메소드
//    public static int hangulToInteger(String hangul) {
//        StringBuilder numberStr = new StringBuilder();
//        for (int i = 0; i < hangul.length(); i++) {
//            char hangulChar = hangul.charAt(i);
//            boolean found = false;
//            for (int j = 0; j < HANGUL_NUMBERS.length; j++) {
//                if (HANGUL_NUMBERS[j].equals(String.valueOf(hangulChar))) {
//                    numberStr.append(j);
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                throw new IllegalArgumentException("Invalid Hangul digit: " + hangulChar);
//            }
//        }
//        return Integer.parseInt(numberStr.toString());
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("한글 숫자를 입력하세요: ");
//        String hangulNumber = scanner.nextLine();
//        int result = hangulToInteger(hangulNumber);
//        System.out.println("변환된 숫자: " + result);
//        scanner.close();
//    }
//}





