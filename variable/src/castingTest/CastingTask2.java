package castingTest;

public class CastingTask2 {
	public static void main(String[] args) {
//		20분
//		1번 문제
//		num1 + str1 + str2로 115 만들기
		int num1 = 1, num2 = 0;
		String str1 = "8.24", str2 = "7.8", result1 = "";
		
		num2 = (int)Double.parseDouble(str1) + (int)Double.parseDouble(str2);
		result1 += num1;
		result1 += num2;
		System.out.println(result1);
		
//		2번 문제
//		'a', 'j', 'k'를 연산하여 'A', 'J', 'K'를 출력하기
		char a = 'a', b = 'b', c = 'c';
		int gap = 'a' - 'A';
		String result2 = "%c, %c, %c\n";
		
		a = (char)(a - gap);
		b = (char)(b - gap);
		c = (char)(c - gap);
		
		System.out.printf(result2, a, b, c);
		
//		3번 문제
//		"12.123"
//		"345.789"
//		"6789.456"
//		3개 값을 더해서 123456789를 출력하기
		
		String str4 = "12.123", str5 = "345.789", str6 = "6789.456", result3 = "";
		int num4 = 0, num5 = 0, num6 = 0;
		
		num4 = (int)Double.parseDouble(str4);
		num5 = (int)Double.parseDouble(str5);
		num6 = (int)Double.parseDouble(str6);
		
		result3 += num4;
		result3 += num5;
		result3 += num6;
		
		System.out.println(result3);
		
		
		
		
		
	}
}
