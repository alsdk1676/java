package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		LambdaInter lambdaInter = new LambdaInter() { // 구현해서 사용 가능?
//			
//			@Override // 선언과 동시에 Inter가 메모리에 올라가면서 메서드를 사용할 수 있음
//			public boolean checkMultipleOf10(int num) {
//				return num % 10 == 0;
//			}
//		};
		
//		LambdaInter lambdaInter = (number) -> {return number % 2 == 0;};
//		LambdaInter lambdaInter = number -> {return number % 2 == 0;};
		LambdaInter lambdaInter = number -> number % 2 == 0;
//		
		System.out.println(lambdaInter.checkMultipleOf10(20));
	}

}
