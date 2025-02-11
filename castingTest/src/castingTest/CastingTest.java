package castingTest;

class Car {
	public Car() {;}
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
}
class SuperCar extends Car {
	public SuperCar() {;}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("뚜껑 오픈!");
	}
	
}

public class CastingTest {
	public static void main(String[] args) {
//		객체화
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
//		up casting
		Car noOptionFerrari = new SuperCar(); // 부모 Car 클래스에 자식 superCar 클래스가 들어감
		noOptionFerrari.engineStart(); 
		// 기존의 오버라이딩 되어있는 값은 부모가 선언했기 때문에 그대로 쓸 수 있음. 자식이 오버라이딩 했다면 오버라이딩 한 코드가 나옴
		
//		오류
//		SuperCar ferrari2 = new Car(); // 자식의 그릇에 부모가 들어가면 부족해서 오류
		
//		down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari; // 자식의 그릇으로 형변환!
		fullOptionFerrari.openRoof();
		
//		객체 instanceof 타입 : 참 또는 거짓의 리턴값을 가집

		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar); // 부모는 자식의 타입이 아니다
		System.out.println(ferrari instanceof Car); // 상속받았기 때문에 자식은 부모타입이기 때문에
		
		
		
	}

}















