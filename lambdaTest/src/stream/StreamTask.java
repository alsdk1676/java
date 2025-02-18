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
		
//		1~100  홀수만
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		IntStream.range(1, 101).filter(n -> n % 2 != 0).forEach(even::add);
		even.forEach(System.out::println);
		
//		A~F중 D만 뺴고
		ArrayList<String> strs2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		strs2.stream().map(str -> str).filter(str -> str != "D").forEach(System.out::println);
		
	}

}
