package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StreamTask2 {
	public static void main(String[] args) {
//		String 문법으로 !
//		1) 5개의 문자열을 모두 소문자로 변경하기
//		"Black", "WHITE", "reD", "yeLLow", "PINK"
		ArrayList<String> datas1 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINK"));
		datas1.stream().map(String::toLowerCase).forEach(System.out::println);

		
//		2) Apple, banana, Melon, cherry, "딸기"
//		단어 중 영문이면서, 앞글자가 대문자인 단어만 출력하기
		ArrayList<String> datas2 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "cherry", "딸기"));
		datas2.stream().filter(str -> str.charAt(0) >= 'A' && str.charAt(0) <= 'Z').forEach(System.out::println);
		
//		강사님 풀이
//		data2.stream()
//			.filter(str -> str.charAt(0) >= 'A')
//			.filter(str -> str.charAt(0) <= 'Z')
//			.forEach(System.out::println);
		
		
//		3) 한글을 정수로 변경
//		"일공이사" -> 1024
//		ArrayList<String> hangles = new ArrayList<String>(Arrays.asList("공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"));
//		hangles.stream().forEach(System.out::print);
//		Map<String, Integer> hanglesToInt = new HashMap<>();
//		
//		for(int i = 0; i < hangles.size(); i++) {
////			hanglesToInt.put(hangles.charAt(i), i);
//			hanglesToInt.put(hangles.get(i), i); // 1 2 3 4 5 6 7 8 9
////			System.out.println(hanglesToInt.put(hangles.get(i), i));
//		}
//		
//		String input = "일공이사";
////		int result = 0;
//		String result = "";
//		for(int i = 0; i < input.length(); i++) {
//			result += input.indexOf(hangles.get(i));
////			System.out.println(result);
//		}
//		System.out.println(result);
		
//		강사님 풀이
		String hangle = "공일이삼사오육칠팔구";
		String data = "일공이사";
		data.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
		
		
//		4) 정수를 한글로 변경
//		"1024" -> 일공이사
//		"1" -> "일"
//		공통점 : 문자열
//		공통점을 만든다
//		"공 ~ 구"
//		문자열 "1", 인덱스 1
//		"일"
		String hangle2 = "공일이삼사오육칠팔구";
		String data2 = "1";
//		문자열을 -> 인트
		hangle2.charAt(Integer.parseInt(data2));
		
//		data2.chars().map(c -> c - 48).forEach(System.out::println); 
		data2.chars().map(c -> c - 48).forEach(i -> {
			System.out.println(hangle2.charAt(i));
		}); 
		
		
		
		
	}

}
