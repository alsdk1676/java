package abstractTest;

public class WashingMachine2 extends Electronics {
//	상속 받자마자 오류 => 추상메서드에 대해 강제성 부여
//	넘치는 건 괜찮지만 부족하면 오류가 발생하기 때문에
//	추상 클래스에서 선언부{}가 부족하기 때문에 오류가 나는데, 여기서 선언해줌으로써 오류 해결
	
//	추상메서드 오버라이딩 필수 !!
	@Override
	public void on() {
		System.out.println("버튼 눌러서 전원 켜기");
	}
	
	@Override
	public void off() {
		System.out.println("버튼 눌러서 전원 끄기");
	}
}
