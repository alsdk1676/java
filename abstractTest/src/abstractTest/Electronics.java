package abstractTest;

//	있을 것 같은 "추상 클래스" : 추상 클래스는 추상 메서드를 가질 수 있음
public abstract class Electronics { 
	
	public abstract void on(); 
	public abstract void off();
	
	public final void safe() {
		System.out.println("안전장치 가동");
	}
}
