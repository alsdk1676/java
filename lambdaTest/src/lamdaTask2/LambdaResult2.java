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
//    public static void main(String[] args) {
//        // 예시 입력
//        String input1 = "7 + 35 - 9";
//        String input2 = "-9 + 8 + 10";
//
//        // OperCheck 인터페이스를 람다식으로 구현
//        OperCheck operCheck = expression -> expression.split(" ");
//
//        // 각 식을 연산하는 함수형 인터페이스
//        Calc calculate = (number1, number2) -> {
//            int result = number1;
//            String[] elements = operCheck.getOpers(input1);
//            for (int i = 1; i < elements.length; i += 2) {
//                String oper = elements[i];
//                int number = Integer.parseInt(elements[i + 1]);
//                if (oper.equals("+")) {
//                    result = add().apply(result, number);
//                } else if (oper.equals("-")) {
//                    result = subtract().apply(result, number);
//                }
//            }
//            return result;
//        };
//
//        // 결과 출력
//        System.out.println(calculate.calc(7, Integer.parseInt(input1.split(" ")[2]))); // 출력: 33
//        System.out.println(calculate.calc(-9, Integer.parseInt(input2.split(" ")[2]))); // 출력: 9
//    }
//}


//package lambdaExpert;
//
//import java.util.function.BiFunction;
//import java.util.function.Function;
//
//public class MyMath {
//
//    // 덧셈 인터페이스를 리턴하는 static 메소드
//    public static Calc calculator(String oper) {
//        switch (oper) {
//            case "+":
//                return (a, b) -> a + b;
//            case "-":
//                return (a, b) -> a - b;
//            default:
//                throw new IllegalArgumentException("Invalid operator");
//        }
//    }
//
//    public static void main(String[] args) {
//        // 예시 입력
//        String input1 = "7 + 35 - 9";
//        String input2 = "-9 + 8 + 10";
//        
//        // OperCheck 인터페이스를 람다식으로 구현
//        OperCheck operCheck = expression -> expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
//
//        // 수식을 받아서 알맞게 연산하는 함수
//        Function<String, Integer> evaluateExpression = expression -> {
//            String[] elements = operCheck.getOpers(expression);
//            int result = Integer.parseInt(elements[0].trim());
//            for (int i = 1; i < elements.length; i += 2) {
//                String oper = elements[i].trim();
//                int number = Integer.parseInt(elements[i + 1].trim());
//                result = calculator(oper).calc(result, number);
//            }
//            return result;
//        };
//
//        // 결과 출력
//        System.out.println(evaluateExpression.apply(input1)); // 출력: 33
//        System.out.println(evaluateExpression.apply(input2)); // 출력: 9
//    }
//}

