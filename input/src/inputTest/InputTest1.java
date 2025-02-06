package inputTest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String name = ""; // 초기값 
		String message = "이름을 입력하세요", lastName = null, firstName = null, name = null; // name에 초기값 null 넣기
		
		System.out.println(message);
//		String name = sc.next(); // sc.next()의 return type : String
//		lastName = sc.next();
//		firstName = sc.next(); // 띄어쓰기를 기준으로 구분점으로 때문에 띄어쓰기 사용할 시 변수 따로 설명하기
//		name = lastName + firstName;
		name = sc.nextLine(); // 띄어쓰기까지 문자열로 처리
		
//		System.out.println(lastName + firstName + "님 환영합니다.");
		System.out.println(name + "님 환영합니다.");
	}
}
