package methodTask;


public class MethodTask1 {
//	1~10까지 println으로 출력하는 메서드
	void printNum() { // 매개변수 받을 필요 없음
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	
//  "홍길동" 이름을 n번 println()으로 출력하는 메서드
	void printName(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("홍길동");
		}
	}
	
	public static void main(String[] args) {
		MethodTask1 mt1 = new MethodTask1();
		mt1.printNum(); 
		mt1.printName(5); // 클래스 안에서 함수 사용
	}

}
