package lambdaTest;

public class LambdaResult {
// 람다식 구현해서 성과 이름을 전달하고 전체 이름을 콘솔에 출력하기
	public static void main(String[] args) {
		// 람다식 : 타입 생략 가능
		PrintName printName = (lastName, firstName) -> { return lastName + firstName; };
		
		System.out.println(printName.getFllName("서", "민아"));
	}
}
