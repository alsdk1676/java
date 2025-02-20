package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {
	public static void main(String[] args) {
//		1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//		numbers.forEach(System.out::println);
//		int result = 0;
//		numbers.stream().map(n -> result += n);
		
//      1) 1~50까지 ArrayList에 담고 출력하기
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		
//		반복할 횟수를 알고 있을 때 : for
//		반복할 횟수를 모를 때 : while
		
//		값을 넣는 로직
//		for(int i = 0; i < 10; i++) {
//			numbers1.add(i + 1);
//		}
		
//		값을 출력하는 로직
//		for(int i = 0; i < numbers1.size(); i++) {
//			System.out.println(numbers1.get(i));
//		}
		
//		값을 넣음
//		numbers1.forEach(null);
		IntStream.rangeClosed(1, 50).forEach(n -> { numbers1.add(n); });
//		값을 출력
		numbers1.forEach(num -> { System.out.println(num); });
		
		
//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).filter(n -> n % 2 != 0).forEach(n -> { numbers2.add(n); });
		numbers2.forEach(num -> { System.out.println(num); });

		
//      3) 1~50까지 ArrayList에 짝수만 담고 출력하기
		ArrayList<Integer> numbers3 = new ArrayList<Integer>();
		IntStream.range(1, 51).filter(n -> n % 2 == 0).forEach(n -> { numbers3.add(n); });
		numbers3.forEach(num -> { System.out.println(num); });
		
//		풀이2 (for문 -> add)
		
//      4) a~z까지 ArrayList에 담고 출력하기
		ArrayList<Character> chars1 = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').forEach(c -> chars1.add((char)c));
		chars1.forEach(System.out::println);
		
//		4-1) a~z까지 A~Z로 변경해서 출력하기
		ArrayList<Character> chars2 = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').map(i -> (char)i).map(Character::toUpperCase).forEach(c -> chars2.add((char)c));
		chars2.forEach(System.out::println);
		
//		풀이 2
//		ArrayList<Integer> data = new ArrayList<Integer>();
//		IntStream.rangeClosed('a', 'z').forEach(data::add);
		
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
		ArrayList<Character> chars3 = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').filter(i -> i % 2 == 1).map(i -> (char)i).forEach(c -> chars3.add((char)c));
		chars3.forEach(System.out::println);
		
//      6) 1~30까지 ArrayList에 담고 10~20만 출력하기
		ArrayList<Integer> numbers4 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 30).filter(num -> num >= 10 && num <= 20).forEach(num -> numbers4.add(num));
		numbers4.forEach(System.out::println);
		
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기 (담으면 forEach)
		ArrayList<Integer> numbers5 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).filter(num -> num % 2 == 0).forEach(num -> numbers5.add(num));
		
		int sum = 0;
		for (int num : numbers5) {
		    sum += num; 
		}

		System.out.println(sum);
		
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
		ArrayList<String> strs1 = new ArrayList<String>(Arrays.asList("hello", "java", "apple", "test"));
		strs1.stream().filter(str -> str.contains("a")).forEach(System.out::println);
		
		
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
		ArrayList<Integer> numbers6 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach(num -> numbers6.add(num));
		
//		int sum2 = 0;
//		for (int num : numbers6) {
//		    sum2 += num; 
//		}
//
//		System.out.println("총합 : " + sum2);
		
//		int sum2 = 0;
//		numbers6.forEach(num -> sum2 += num);		
//		System.out.println(sum2);
		
		// reduce
		int sum2 = numbers6.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum2);
		
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
		ArrayList<Integer> task = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		int sum3 = task.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum3);
//		int data = task.stream().reduce(0, (a, b) -> a + b);
//		Optional<Integer> data = task.stream().reduce((a, b) -> a + b);
//		System.out.println(data);
		
//		강사님 풀이
//		int[] datas10 = new int[] {10, 20, 30, 40, 50, 60};
//		List<Integer> data10 = Arrays.stream(datas10).boxed().collect(Collectors.toList());
//		Integer totalResult = data10.stream().reduce(0, (a, b) -> a + b);
//		System.out.println(totalResult);
		
		
		
//      2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//      모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
//      필드 : 이름, 취미, 소개
//      홍길동, 축구_농구_야구, 나는 축구왕!
//      이순신, 개발_당구_축구, 나는 개발자 좋아!
//      장보고, 피아노, 피아노만 한 우물!
//      김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//      김영희, 골프_야구, 운동 선수는 나의 꿈
//      흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈!");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(member1);
		members.add(member2);
		members.add(member3);
		members.add(member4);
		members.add(member5);
		members.add(member6);
		
//		members.forEach(System.out::println);
		
//		members.stream().map(Member::getHobby).map((hobby) -> hobby).forEach(System.out::println);
//		members.stream().map(Member::getHobby).filter((hobby) -> hobby.contains("개발")).forEach(System.out::println);
//		members.stream().map(Member::getHobby).filter((hobby) -> hobby.contains("개발"));
		members.stream().filter(member -> member.getHobby().contains("개발")).forEach(System.out::println);
	}
	

}
