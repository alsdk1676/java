package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
//		1) 1~10까지 ArrayList에 담고 출력하기
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		IntStream.range(1, 11).forEach((numbers::add));
		numbers.forEach(System.out::println);
		
//		2) ABCDEF를 각 문자열로 출력
		ArrayList<String> strs = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		strs.stream().map(str -> str).forEach(System.out::println);
		
//		1~100 홀수만
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		IntStream.range(1, 101).filter(n -> n % 2 != 0).forEach(even::add);
		even.forEach(System.out::println);
		
//		A~F중 D만 뺴고
		ArrayList<String> strs2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		strs2.stream().map(str -> str).filter(str -> str != "D").forEach(System.out::println);
		
	}

}


//import java.util.*;
//
//public class KoreanNumberConverter {
//    public static void main(String[] args) {
//        String input = "일공이사";
//        ArrayList<String> koreanNumbers = new ArrayList<>(Arrays.asList("공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"));
//        Map<String, Integer> koreanToInteger = new HashMap<>();
//
//        for (int i = 0; i < koreanNumbers.size(); i++) {
//            koreanToInteger.put(koreanNumbers.get(i), i);
//        }
//
//        int result = 0;
//        for (char ch : input.toCharArray()) {
//            result = result * 10 + koreanToInteger.get(String.valueOf(ch));
//        }
//
//        System.out.println(result);
//    }
//}
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> str1 = new ArrayList<>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINK"));
//        
//        ArrayList<String> lowercased = new ArrayList<>();
//        for (String s : str1) {
//            lowercased.add(s.toLowerCase());
//        }
//        
//        System.out.println(lowercased);
//    }
//}

//ArrayList<String> datas2 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "cherry", "딸기"));
//datas2.stream()
//      .filter(str1 -> str1.matches("[A-Z].*"))
//      .forEach(System.out::println);

//ArrayList<String> datas2 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "cherry", "딸기"));
//datas2.stream()
//      .filter(str1 -> (str1.charAt(0) >= 'A' && str1.charAt(0) <= 'Z') ? true : false)
//      .forEach(System.out::println);
아니 앞글자인 문자들을 


