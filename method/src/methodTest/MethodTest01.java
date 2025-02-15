package methodTest;

public class MethodTest01 {
	
//	두 수를 더해서 더한 값을 알려주는 메서드
	int add(int num1, int num2){ // 제일 앞에 int : 전체를 return값으로 보기 : num1 + num2 => int
		return num1 + num2;
	}
	
//	이름을 받으면 이름을 콘솔에 출력해주는 메서드
	void printName(String name) { // return 할 값이 없으면 void
		System.out.println(name); // syso는 값이 아니라 기능
	}
	
//	정수 1개를 받아서 홀수인지 짝수인지 알려주는 메서드
	String isOddEven(int num) {
		return num % 1 == 0 ? "짝수" : "홀수";
	}
	
//	두 개의 정수를 뺀 결과를 알려주는 메서드
	int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static void main(String[] args) {
//		클래스명 변수명 = new 클래스명();
		MethodTest01 mt = new MethodTest01();
		int result = 0; // return 타입 : int(num1-num2)
		result = mt.subtract(0, 0); // 클래스 안에서 함수 사용
	}
	
}


