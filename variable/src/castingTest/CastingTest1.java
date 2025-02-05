package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
//		자동 형변환
		System.out.println(1 + 2); // 정수
		System.out.println(1 + 2.5); // 실수
		
//		강제 형변환
		System.out.println(5 / 2); // 정수 / 정수 = 정수 2
		System.out.println(5 / (double)2); // 정수 / 실수(강제) = 실수 2.5
		
	}
}
