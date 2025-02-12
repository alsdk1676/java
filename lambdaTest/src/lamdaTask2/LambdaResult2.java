package lamdaTask2;

//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10() // 리턴값 없음
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount() // 개수를 리턴
//3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
//5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

public class LambdaResult2 {
	public static void main(String[] args) {
		
		//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
		 PrintNumInter printNumInter = () -> {
			 for (int i = 1; i <= 10; i++) {
				 System.out.println(i);
				 }
			 };
			 printNumInter.printUpTo10();
			 
		
		//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
		PrintStringInter printString = (content, c) -> {
			int count = 0;
			for (int i = 0; i < content.length(); i++) {
				if(content.charAt(i) == c) {
					count++;
				}
			}
			return count;
		};
		int result2 = printString.strCount("apple", 'a');
		System.out.println("해당 문자 개수 : " + result2);
			 
		
		//3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
//		ReverseInter reverseInter = (content) -> {
//			String result = "";
//			for(int i = 0; i < content.length(); i++) {
//				result = result + content.charAt(i);
//			}
//			return result;
//		};
//		System.out.println(reverseInter.reverseString("apple"));
//		
		ReverseInter reverseInter = (content) -> {
			String result = "";
			for(int i = 0; i < content.length(); i++) {
				result += content.charAt(content.length() - i - 1);
			}
			return result;
		};
		System.out.println(reverseInter.reverseString("apple"));
		
		
		//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
//		문자열을 받는다.
//		같은 문자를 찾는다.
//		문자 삭제.. 
//		삭제 메서드..?
//		반대로 -> 해당 문자 아닌것만 누적합
//		RemoveInter removeInter = (content, c) -> {
//			String result = "";
//			for(int i = 0; i < content.length(); i++) {
//				if(content.charAt(i) != c) { // 찾은 문자형 아닌것만 더해
//					result += content.charAt(i);
//					}
//				}
//				return result;
//			};
//			System.out.println(removeInter.removeStr("apple", 'p'));
		
			RemoveInter removeInter = (content, c) -> {
				String result = "";
				for(int i = 0; i < content.length(); i++) {
					if(content.charAt(i) == c) { // 찾은 문자형 아닌것만 더해
						continue;
					}
					result += content.charAt(i);
				}
				return result;
			};
			System.out.println(removeInter.removeStr("apple", 'p'));
			
		//5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
		//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
		DedupeInter dedupe = (content) -> {
			String result = "";
			for(int i = 0; i < content.length(); i++) {
//				result.contains("" + content.charAt(i)) // String값이 들어가야댐 65 값 주의
//				result.contains(String.valueOf(content.charAt(i))) // 전체가 true,false값
				if(result.contains(String.valueOf(content.charAt(i)))) {
					result += String.valueOf(content.charAt(i));
				}
			}
			return result;
		};
		
		String result5 = dedupe.getDedupe("가나다가나다라가나다라마바사");
		System.out.println(result5);
		
		
	}

}
//import java.util.function.BiFunction;
//import java.util.function.Function;
//
//public class Main {
//    public static void main(String[] args) {
//        // 예시 입력
//        String input1 = "7 + 35 - 9";
//        String input2 = "-9 + 8 + 10";
//        
//        // 식을 연산하는 함수형 인터페이스
//        Function<String, Integer> evaluateExpression = expression -> {
//            String[] numbers = expression.split("\\+|\\-");
//            String[] operators = expression.split("[0-9]+");
//            int result = Integer.parseInt(numbers[0].trim());
//            
//            for (int i = 1; i < numbers.length; i++) {
//                if (operators[i].contains("+")) {
//                    result += Integer.parseInt(numbers[i].trim());
//                } else if (operators[i].contains("-")) {
//                    result -= Integer.parseInt(numbers[i].trim());
//                }
//            }
//            return result;
//        };
//
//        // 결과 출력
//        System.out.println(evaluateExpression.apply(input1)); // 출력: 33
//        System.out.println(evaluateExpression.apply(input2)); // 출력: 9
//    }
//    
//    // 덧셈 인터페이스를 리턴하는 static 메소드
//    public static BiFunction<Integer, Integer, Integer> add() {
//        return (a, b) -> a + b;
//    }
//
//    // 뺄셈 인터페이스를 리턴하는 static 메소드
//    public static BiFunction<Integer, Integer, Integer> subtract() {
//        return (a, b) -> a - b;
//    }
//}

//package lambdaExpert;
//
//import java.util.function.BiFunction;
//
//public class Main {
//
//    // 덧셈 인터페이스를 리턴하는 static 메소드
//    public static BiFunction<Integer, Integer, Integer> add() {
//        return (a, b) -> a + b;
//    }
//
//    // 뺄셈 인터페이스를 리턴하는 static 메소드
//    public static BiFunction<Integer, Integer, Integer> subtract() {
//        return (a, b) -> a - b;
//    }
//



//package lambdaExpert;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MyMath {
//	
//    // 연산자 1개를 전달 받아서 알맞게 연산하도록 람다식을 구현
//    public static Calc caculater(String oper) {
//        return switch (oper) {
//            case "+" -> (a, b) -> a + b;
//            case "-" -> (a, b) -> a - b;
//            case "*" -> (a, b) -> a * b;
//            case "/" -> (a, b) -> a / b;
//            default -> throw new IllegalArgumentException("Invalid operator: " + oper);
//        };
//    }
//
//    // 수식에서 연산자 기준으로 계산 처리하기
//    public static int calculate(String inputCalc) {
//        // 숫자가 들어갈 배열 선언
//        String[] array = null, operArray = null;
//        int result = 0;
//
//        // 숫자만 추출해서 배열에 넣기
//        array = inputCalc.split("\\+|\\-|\\*|\\/");
//        List<Integer> numbers = new ArrayList<>();
//        for (String num : array) {
//            numbers.add(Integer.parseInt(num.trim()));
//        }
//
//        // 연산자만 추출해서 배열에 넣기
//        StringBuilder opers = new StringBuilder();
//        for (int i = 0; i < inputCalc.length(); i++) {
//            if (inputCalc.charAt(i) == '+' || inputCalc.charAt(i) == '-' || inputCalc.charAt(i) == '*' || inputCalc.charAt(i) == '/') {
//                opers.append(inputCalc.charAt(i));
//            }
//        }
//       
//        operArray = opers.toString().split(""); // 연산자 배열로 변환
//
//        // 1. 먼저 *, / 연산을 수행
//        numbers = applyOperations(numbers, operArray, "*", "/");
//
//        // 2. 이후 +, - 연산을 수행
//        numbers = applyOperations(numbers, operArray, "+", "-");
//
//        // 최종 결과는 numbers 배열에 남은 마지막 값
//        result = numbers.get(0);
//        
//        return result;
//    }
//
//    // *, / 연산을 먼저 계산하는 메서드
//    public static List<Integer> applyOperations(List<Integer> numbers, String[] operArray, String targetOper1, String targetOper2) {
//        List<Integer> newNumbers = new ArrayList<>();
//        List<String> newOperArray = new ArrayList<>();
//
//        int i = 0;
//        while (i < operArray.length) {
//            String oper = operArray[i];
//            if (oper.equals(targetOper1) || oper.equals(targetOper2)) {
//                // 연산을 수행
//                int num1 = numbers.get(newNumbers.size());
//                int num2 = numbers.get(i + 1);
//                int result = caculater(oper).operate(num1, num2);
//
//                // 연산 결과를 새로운 리스트에 반영
//                newNumbers.set(newNumbers.size() - 1, result);
//            } else {
//                // 연산하지 않은 숫자는 그대로 새로운 리스트에 추가
//                newNumbers.add(numbers.get(i + 1));
//                newOperArray.add(oper);
//            }
//            i++;
//        }
//
//        // 마지막 숫자 추가
//        if (newNumbers.size() < numbers.size()) {
//            newNumbers.add(numbers.get(numbers.size() - 1));
//        }
//
//        // 연산자 리스트를 갱신
//        operArray = newOperArray.toArray(new String[0]);
//
//        return newNumbers;
//    }
//
//    public static void main(String[] args) {
//        // 스캐너 임포트
//        Scanner sc = new Scanner(System.in);
//
//        // 숫자가 들어갈 배열 선언
//        String inputCalc = sc.nextLine(); // 사용자 입력을 받는다.
//        
//        // 계산 처리 및 결과 출력
//        int result = calculate(inputCalc);
//        System.out.println(result);
//
//        sc.close();
//    }
//}

//연산자 1개를 전달 받아서 알맞게 연산하도록 함수형 인터페이스를 구현
//public static Calc caculater(String oper) {
// if (oper.equals("+")) {  (a, b) -> a + b;
// } else if (oper.equals("-")) {
//     return (a, b) -> a - b;
// } else if (oper.equals("*")) {
//     return (a, b) -> a * b;
// } else if (oper.equals("/")) {
//     return (a, b) -> a / b;
// } else {
//     throw new IllegalArgumentException("Invalid operator: " + oper);
// }
//}

//System.out.println(Arrays.toString(operArray));  // 연산자 배열 출력: [+,-,*]
