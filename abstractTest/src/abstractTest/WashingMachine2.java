package abstractTest;

public class WashingMachine2 extends Electronics {

	@Override
	public void on() {
		System.out.println("버튼 눌러서 전원 켜기");
	}
	
	@Override
	public void off() {
		System.out.println("버튼 눌러서 전원 끄기");
	}
}
