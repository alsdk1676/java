package abstractTest;

//public class Tiger implements Pet{
public class Tiger2 extends PetAdapter { // PetAdapter는 클래스이기 때문에 extends
	
//	사용하고 싶지 않아도 인터페이스는 강제성을 부여하기 때문에 사용해야함 ..
//	adapter 클래스가 강제성이 필요한 것에만 부여될 수 있도록 도와줌 강제성 없어짐
//	PetAdapter 때문에 지워도 오류 발생하지 않음
//	@Override
//	public void poop() {
//		
//	}

	@Override
	public void sitDown() {
		System.out.println("호랑이는 앉지 않는다.");
	}
	
	@Override
	public void waitNow() {
		System.out.println("호랑이는 기다리지 않는다.");
	}

}
