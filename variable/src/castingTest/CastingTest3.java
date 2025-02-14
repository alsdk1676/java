package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
//		자동 형변환
//		정수 -> 문자열
		System.out.println("1" + 10); // 연결
		System.out.println("1" + 3 + 8); // 연결
		System.out.println("1" + (3 + 8)); // 111 (연결 + 연산)
		
//		System.out.println((int)"1" + 100); // (기본자료형)클래스 => 오류 발생!
		System.out.println(Integer.parseInt("1") + 100); // 함수가 없으니까 객체를 먼저 호출(불러오기)
		System.out.println(Double.parseDouble("3.9") + 20); // 23.9
		System.out.println(Boolean.parseBoolean("true")); // true
	}
}
