package castingTest;

class Car2 {
	public Car2() {;}
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
}
class SuperCar2 extends Car2 {
	public SuperCar2() {;}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("뚜껑 오픈!");
	}
	
}

public class CastingTest2 {
	public static void main(String[] args) {
//		객체화
		Car2 matiz = new Car2();
		SuperCar2 ferrari = new SuperCar2();
		
//		up casting
		Car2 noOptionFerrari = new SuperCar2(); // 부모 Car 클래스에 자식 superCar 클래스가 들어감
//		noOptionFerrari는 Car 타입의 변수이지만, SuperCar 객체를 참조
		noOptionFerrari.engineStart(); 
		// 기존의 오버라이딩 되어있는 값은 부모가 선언했기 때문에 그대로 쓸 수 있음. 자식이 오버라이딩 했다면 오버라이딩 한 코드가 나옴
		
//		오류
//		SuperCar ferrari2 = new Car(); // 자식의 그릇에 부모가 들어가면 부족해서 오류
		
//		down casting
		SuperCar2 fullOptionFerrari = (SuperCar2)noOptionFerrari; // 자식의 그릇으로 형변환!
		fullOptionFerrari.openRoof();
		
//		객체 instanceof 타입 : 참 또는 거짓의 리턴값을 가집
		System.out.println(matiz instanceof Car2); // true: 부모는 자식 타입이 아니기 때문에, matiz는 Car 타입이므로
		System.out.println(matiz instanceof SuperCar2); // false: matiz는 SuperCar 타입이 아님
		System.out.println(ferrari instanceof Car2); // true: ferrari는 SuperCar로 Car를 상속받았기 때문에
		System.out.println(ferrari instanceof SuperCar2); // true: ferrari는 실제로 SuperCar 객체
		System.out.println(noOptionFerrari instanceof Car2); // true: noOptionFerrari는 Car 타입으로 업캐스팅된 SuperCar 객체
		System.out.println(noOptionFerrari instanceof SuperCar2);  // true: noOptionFerrari는 실제 SuperCar 객체
		System.out.println(fullOptionFerrari instanceof Car2); // true: fullOptionFerrari는 SuperCar 객체로 Car를 상속받았기 때문
		System.out.println(fullOptionFerrari instanceof SuperCar2); // true: fullOptionFerrari는 SuperCar 객체

	
		
	}

}


