package inheritanceTask;


class Car {
	String brand;
	String color;
	long price;
	
	public Car() {;}
	public Car(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("열쇠 시동 켜짐");
	}

	void engineStop() {
		System.out.println("열쇠 시동 꺼짐");
	}
}
	

class SuperCar extends Car {
	String mode;
	
	public SuperCar() {;}
	public SuperCar(String color, String brand, long price, String mode) {
//		자식 변수 mode는 초기화 할 방법이 없음
// 		부모를 먼저 호출하기 때문에 부모에게 넘겨서 mode도 같이 초기화시킴
		super(brand, color, price); // 부모 생성자를 호출하고 있음 brand, color, price 를 받고 있는 부모 생성자
		this.mode = mode;
	}
	
	@Override
	void engineStart() { // 상속에서 메서드 : 저장공간!
//		super.engineStart(); // 이 부분 생략하면 자식의 engineStart만 나옴
		System.out.println("음성 시동 켜짐");
	}
	
	@Override
	void engineStop() {
//		super.engineStop();
		System.out.println("음성 시동 꺼짐");
	}
	
}

public class InheritanceTaskReview {
	public static void main(String[] args) {
//		객체화
		Car matiz = new Car("기아", "빨강", 1000000);
		System.out.println(matiz.color);
		SuperCar ferrari = new SuperCar();
		ferrari.engineStart(); // 부모 engineStart 먼저 호출 후, 자식 engineStart 출력
		matiz.engineStart(); // 덮어쓰기 전 결과 (Car 입장에서는 SuperCar를 모르기 떄문)
	}

}






