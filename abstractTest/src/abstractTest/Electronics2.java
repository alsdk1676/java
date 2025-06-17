package abstractTest;

//	있을 것 같은 "추상 클래스" : 추상 클래스는 추상 메서드를 가질 수 있음
public abstract class Electronics2 { 
	
//	추상 메서드
//	전자기기는 키고 끄는 방법이 다양하기 때문에 당장 구현 불가능
//	하지만 반드시 필요한 기능
//	구현할 수 없기 때문에 선언만 해놓기 => 메서드명();
	public abstract void on(); 
	public abstract void off();
	
//	상수 : final => 수정 불가능, 고정
	public final void safe() {
		System.out.println("안전장치 가동");
	}
}
