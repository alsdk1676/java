package castingTest;

public class CastingTask1 {
	public static void main(String[] args) {
//		8.43 + 2.59를 더해서 10이 나오도록 출력하기
//		단 변수에 값을 담아서 사용하기
		
		double num1 = 8.43, num2 = 2.59;
//		System.out.println(num1 + num2);
//		int result = 0;
		int result = (int)num1 + (int)num2;
		System.out.printf("결과 : %d", result);
		System.out.println("결과 : " + result);

	}

}




//double num1 = 8.43, num2 = 2.59;
//int result = 0;
//
//result = (int)num1 + (int)num2;
//System.out.printf("결과 값 : %d", result);