package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] arData = new int[5];
		int num = 0;
		
//			Alt + Shift + Z
			try {
				
//				System.out.println(arData[10]); // 오류
				arData[0] = 20;
				System.out.println(arData[0] / num); // 오류
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스 똑바로 확인해!");
			} catch (ArithmeticException e) { // 데드 코드 => 부모가 이미 다 오류를 잡았기 때문에 잡을 오류가 없음! => ㅇ엄마보다 위에
				System.out.println("0으로 나눌 수 없다!");
				System.out.println(e.getClass());
				System.out.println(e.getMessage());
				e.printStackTrace(); // 오류 내용, 이름 같이 출력
			} catch (Exception e) { // Exception : 모든 오류의 부모 =>  오류 다 잡음
				e.printStackTrace();
			} 
//				catch (ArithmeticException e) { // 데드 코드 => 부모가 이미 다 오류를 잡았기 때문에 잡을 오류가 없음! => ㅇ엄마보다 위에
//				System.out.println("0으로 나눌 수 없다!");
//			}

	}
}
