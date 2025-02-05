package castingTest;

public class CastingTask2 {
	public static void main(String[] args) {
//      1번 문제
//      num1 + str1 + str2로 115 만들기
//      int num1 = 1;
//      String str1 = "8.24", str2 = "7.8";
		
		int num1 = 1;
		String str1 = "8.24", str2 = "7.8";
		System.out.println("" + num1 + ((int)Double.parseDouble(str1) + (int)Double.parseDouble(str2)));
      
//      2번 문제
//      a, j, k를 연산하여 A, J, K를 출력하기
		char a = 'a', b = 'b', c ='c';
		int gap = 'a' - 'A';
//		System.out.println((char)(a - gap));
		String result = "%c, %c, %c";
		
		a = (char)(a - gap);
		b = (char)(b - gap);
		c = (char)(c - gap);
		
//		System.out.println("%c, %c, %c", a, b, c);
		System.out.printf(result, a, b, c);
      
//      3번 문제
//      "12.123"
//      "345.789"
//      "6789.456"
//      3개 값을 더해서 123456789를 출력하기
	}
}
