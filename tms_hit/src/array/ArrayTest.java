package array;

public class ArrayTest {
//	순서가 필요한 자료구조
	public static void main(String[] args) {
		String[] ArrayTest = {"0", "1", "2", "3", "4", "5"};
		int[] arr = new int[10];
//		방 번호가 10개면 10번이나 써야되네 ? 줄일 수 있는 방법은? 반복문
//		규칙성을 찾는다.
//		1씩 증가하는 반복문을 만든다.
		for(int i = 0; i < 10; i++) {
			arr[i] = 10;
		}
		
//		로또 번호
//		6개
		String[] lotto = new String[6];
//		String[] lotto2 = new String[?];
		
//		System.out.println(Math.random()); // 0 보다 크고 1보다 작은 랜덤 값 출력
//		번호를 만들고 싶다면 Math.random에 해당 값까지 곱한다. ex) 45까지 출력하고 싶다면 * 45
//		형 변환
//		실수 -> 정수 어떻게? -> 문자열에 어떻게 넣지?
//		(int)
		
		System.out.println((int)(Math.random() * 45));  // 규칙성 발견! 

		for(int i = 0; i < new ArrayTest().test.length; i++) {
//		for(int i = 0; i < lotto.length; i++) {
//			lotto[i] = "번호"; // 랜덤;
			lotto[i] = String.valueOf((int)(Math.random() * 45));
			System.out.println(lotto[i]);
		}
		
		lotto[0] = "번호";
		lotto[1] = "번호";
		lotto[2] = "번호";
		lotto[3] = "번호";
		lotto[4] = "번호";
		lotto[5] = "번호";
		
	}
	

}
