package variableTest;

public class Variable {
	public static void main(String[] args) {
		int a = 10; // 정수 4byte
		long b = 20; // 정수 8byte
		
		float c = 3.14F; // 실수 4byte
		double d = 3.14; // 실수 8byte
//		double d = 10;
		
		boolean e = true; // 논리 1byte
		char f = '서'; // 문자형 2byte
		String g = "서민아"; // 문자열 ? 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	
		
	}
}
