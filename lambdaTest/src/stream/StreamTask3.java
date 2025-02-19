package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamTask3 {
	public static void main(String[] args) {
//		1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
//		numbers.forEach(System.out::println);
//		int result = 0;
//		numbers.stream().map(n -> result += n);
		
//      1) 1~10까지 ArrayList에 담고 출력하기
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
		IntStream.rangeClosed(1, 10).forEach(n -> { numbers1.add(n); });
//		값을 출력
		numbers1.forEach(num -> { System.out.print(num); });
		
		
//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		
		IntStream.rangeClosed(1, 10).filter(n -> n % 2 != 0).forEach(n -> { numbers2.add(n); });
		numbers2.forEach(num -> { System.out.println(num); });

		
		
//      3) 1~10까지 ArrayList에 짝수만 담고 출력하기
//      4) a~z까지 ArrayList에 담고 출력하기
//		4-1) a~z까지 A~Z로 변경해서 출력하기
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
//      6) 1~30까지 ArrayList에 담고 10~20만 출력하기
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//		ArrayList<Integer> task = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		ArrayList<Integer> task = new ArrayList<Integer>(Arrays.asList());
//		int data = task.stream().reduce(0, (a, b) -> a + b);
		Optional<Integer> data = task.stream().reduce((a, b) -> a + b);
		System.out.println(data);
		
		
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
		members.stream().map(Member::getHobby).filter((hobby) -> hobby.contains("개발")).forEach(System.out::println);
//		members.stream().map(Member::getHobby).filter((hobby) -> hobby.contains("개발"));
	}
	

}
