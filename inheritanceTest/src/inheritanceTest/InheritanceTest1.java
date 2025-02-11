package inheritanceTest;

class A {
	String name;
	int data;
	
//	기본 생성자
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
	
	void printName() {
		System.out.println(name);
	}
}

// A를 상속 받음
class B extends A{ // extends 키워드로 B가 A의 정보를 다 가지고 있는게 아니라 super 키워드 때문임!!
//	눈에 보이지 않지만 이미 상속 받음
//	String name;
//	int data;
	
//	기본 생성자
	public B() {
//		super(); // 상속을 물려받은 부모 클래스를 먼저 호출하는 키워드 (생략이 되어있어도 컴파일러가 자동으로 호출) => 부모의 기본생성자를 호출하는 키워드
//		부모 필드에 있는 주소값이 접근 가능 (super())
		System.out.println(this);
		System.out.println("자식 생성자 호출");
	}
	
	void printData() {
		System.out.println(data);
	}
	
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		// 객체화
//		B만 할당된 것처럼 보이지만 부모를 먼저 호출해서 할당시킨 후, 자식을 메모리에 할당시킴
		B b = new B();
		b.printName(); // A : A를 상속받았기 때문 , 자식에게 부모의 메서드 호출 => 부모의 이름 출력 => 부모에 정상적으로 접근
		b.printData(); // 10
		System.out.println(b); // 객체화시켰기 때문에 주소값 출력됨
	}
}
