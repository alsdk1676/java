package castingTest;

public class CastingTask2 {
	public static void main(String[] args) {
//		20분
//      1번 문제
//      num1 + str1 + str2로 115 만들기
//      int num1 = 1;
//      String str1 = "8.24", str2 = "7.8";
		
		int num1 = 1;
		String str1 = "8.24", str2 = "7.8";
		int num2 = 0;
		num2 = (int)Double.parseDouble(str1) + (int)Double.parseDouble(str2);
//		System.out.println(num2);
		String result = "";
		result += num1;
		result += num2;
		System.out.println(result);

		
//		2번 문제
//		'a', 'j', 'k'를 연산하여 'A', 'J', 'K'를 출력하기
//		System.out.println((int)'j');
//		System.out.println((int)'J');
		
		char a = 'a', j = 'j', k = 'k', A = 'A', J = 'J', K = 'K';
		int gap = 'a' - 'A';
		String result3 = "%c, %c, %c\n";
//		System.out.println(gap); // 32
		a = (char)(a - gap); // a = A
//		System.out.println(a);
		j = (char)(j - gap);
		k = (char)(k - gap);
		
		System.out.printf(result3, a, j ,k);
		
//		String result2 = "%c, %c, %c\n";
//		System.out.printf(result2, a, b, c);
//		System.out.printf("%c, %c, %c\n", a, b, c);
		

		
//		3번 문제
//		"12.123"
//		"345.789"
//		"6789.456"
//		3개 값을 더해서 123456789를 출력하기
		String str4 = "12.123";
		String str5 = "345.789";
		String str6 = "6789.456";
//		double num4 = Double.parseDouble(str4);
//		System.out.println(num4); // 12.123
		int num4 = (int)Double.parseDouble(str4);
//		System.out.println(num4); // 12
		int num5 = (int)Double.parseDouble(str5);
		int num6 = (int)Double.parseDouble(str6);
		String result2 = "";
		result2 += num4;
		result2 += num5;
		result2 += num6;
		
		System.out.println(result2);
		
		
	}
}

////1번 문제
////num1 + str1 + str2로 115 만들기
//int num1 = 1, num2 = 0;
//String str1 = "8.24", str2 = "7.8", result1 = "";
//
//num2 = (int)Double.parseDouble(str1) + (int)Double.parseDouble(str2);
//result1 += num1;
//result1 += num2;
//System.out.println(result1);
//
////2번 문제
////'a', 'j', 'k'를 연산하여 'A', 'J', 'K'를 출력하기
//char a = 'a', b = 'b', c = 'c';
//int gap = 'a' - 'A';
//String result2 = "%c, %c, %c\n";
//
//a = (char)(a - gap);
//b = (char)(b - gap);
//c = (char)(c - gap);
//
//System.out.printf(result2, a, b, c);
//
////3번 문제
////"12.123"
////"345.789"
////"6789.456"
////3개 값을 더해서 123456789를 출력하기
//
//String str4 = "12.123", str5 = "345.789", str6 = "6789.456", result3 = "";
//int num4 = 0, num5 = 0, num6 = 0;
//
//num4 = (int)Double.parseDouble(str4);
//num5 = (int)Double.parseDouble(str5);
//num6 = (int)Double.parseDouble(str6);
//
//result3 += num4;
//result3 += num5;
//result3 += num6;
//
//System.out.println(result3);

