package stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamTest {
	public static void main(String[] args) {
//		IntStream : 시작점부터 끝점까지 정해준다. 1씩 증가 (횟수만 정의)
		IntStream.range(0, 10); // 0 ~ 9까지
		
//		IntStream.range(0, 10).forEach((num) -> { System.out.println(num); }); // forEach는 return 없음 (기능만) => 중괄호 생략 안됨
//		IntStream.range(0, 10).forEach(System.out::println); // 참조형 (받자마자 사용할 때)
		
//		asList : 값을 알고 있을 떄 초기값을 넣기 위한 메서드
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//		IntStream.rangeClosed(1, 10); // 0 ~ 10까지
//		IntStream.rangeClosed(0, 10).forEach((num) -> datas.add(num));
		IntStream.rangeClosed(1, 10).forEach(datas::add); // forEach()는 항상 마지막 
//		datas.forEach(System.out::println);
		
		
//		10 ~ 1까지 ArrayList에 담고 출력하기, 참조형 x 연산 후 add하기
		ArrayList<Integer> datas2 = new ArrayList<Integer>();
		IntStream.range(0, 10).forEach((num) -> {
			datas2.add(10 - num);
			});
//		IntStream.rangeClosed(10, 1).forEach(datas2::add); // 참조형
//		datas2.forEach(System.out::println);
		
//		data2 인덱스 0부터 4까지 삭제
//		참조형 사용하면 안됨
		IntStream.range(0, 5).forEach( num -> {
			datas2.remove(0);
		});
//		datas2.forEach(System.out::println);
		
//		문자열 stream
//		chars() : 문자열을 Intstream으로 변환
		String data3 = "ABCDEFG";
		String data4 = "ㄱㄴㄷㄹ";
//		data3.chars().forEach(System.out::println);
//		data4.chars().forEach(System.out::println);
		
//		data4.chars().forEach((c) -> { System.out.println((char)c); });

//		.map()
//		data4.chars().map((c) -> c + 4).forEach(c -> { System.out.println((char)c); }); // 형변환 마지막에
//		data4.chars().map((c) -> (char)(c + 4)).forEach(System.out::println); // 형병환 변형 안됨
		
		
		User user1 = new User(1, "서민아", 26, "학생");
		User user2 = new User(2, "홍길동", 20, "개발자");
		User user3 = new User(3, "장보고", 30, "요리사");
		User user4 = new User(4, "이순신", 40, "디자이너");
		User user5 = new User(5, "이성계", 50, "사장");
		
//		직업만 출력하기 
		ArrayList<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		users.forEach(System.out::println);
//		map은 stream 문법 => stream을 적어야 map 사용 가능
//		직업만 가져오기
//		users.stream().map((user) -> user.getJob()).map((job) -> "직업 : " + job).forEach(System.out::println);
//		users.stream().map((user) -> user.getJob()).map((job) -> { return "직업 : " + job; }).forEach(System.out::println);
		users.stream().map(User::getJob).map((job) -> { return "직업 : " + job; }).forEach(System.out::println);
		
//		유저의 나이만 출력하기 (참조형 X)
		users.stream().map((user) -> user.getAge()).map((age) -> "나이 : " + age).forEach(System.out::println);
		
//		실습
//		"/news", "/game", "/brand", "/rank"
//		ArrayList에 담고, 모든 경로 앞에 "/app"을 붙여준다.
		ArrayList<String> apps = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		apps.stream().map((app) -> "/app" + app).forEach(System.out::println);
		
		
//		정렬 : sorted() - 오름차순
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		numbers.stream().sorted().forEach(System.out::println);		
		
//		내림차순
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		결과값의 리턴을 다양한 타입으로 리턴 : .collect(Collector.to~());
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		List<Integer> list = numbers2.stream().map(n -> n + 10).collect(Collectors.toList());
		System.out.println(list.toString());
		
//		문자열로 바꾸기
		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		String str = numbers3.stream().sorted().map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(str);
		
//		filter()
		ArrayList<Integer> numbers4 = new ArrayList<Integer>(Arrays.asList(1, 10, 6, 4, 8));
		ArrayList<Integer> even = new ArrayList<Integer>();
//		numbers.stream().filter((n) -> n % 2 == 0).forEach(System.out::println);
		numbers.stream().filter((n) -> n % 2 == 0).forEach(even::add);
		even.forEach(System.out::println);
		
		
		
		
		
		}	
}
