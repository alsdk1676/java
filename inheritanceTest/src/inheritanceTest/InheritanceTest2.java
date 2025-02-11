package inheritanceTest;

class Human {
	String name;
	public Human() {}
	public Human(String name) {
		this.name = name;
	}
	
//	먹고, 자고, 걷기
	void eat() {
		System.out.println("먹기");
	}
	
	void sleep() {
		System.out.println("자기");
	}
	
	void walk() {
		System.out.println("두 발로 걷기");
	}
}

class Monkey extends Human {
//	void walkMonkey() {
//		System.out.println("네 발로 걷기");
//	}
	
//	재정의
//	@ : 어노테이션(Annotation)
	@Override // 부모의 코드를 오버라이딩 했다는 표시
	void walk() { // 오버라이딩
		System.out.println("네 발로 걷기");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
//		객체화
		Monkey kingkong = new Monkey();
//		kingkong.walk(); // 두 발로 걷기
//		kingkong.walkMonkey();
		kingkong.walk(); // 자식의 walk() "네 발로 걷기"
	}

}
