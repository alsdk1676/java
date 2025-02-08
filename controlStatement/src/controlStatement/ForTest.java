package controlStatement;

public class ForTest {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) { // i의 마지막 값 : 9가 아니라 10!!!
			System.out.println("서민아");
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "번 째 서민아"); // i + 1 괄호 필요 X (코드는 좌에서 우로)
		}
	}

}
