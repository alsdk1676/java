package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "서민아";
		int age = 20;
		double height = 156.5;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("키 : %.1fcm", height); // %와 f 사이에 .자릿수
	}
}
