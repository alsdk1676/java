package abstractTest;

public abstract class Electronics2 { 

	public abstract void on(); 
	public abstract void off();
	
	public final void safe() {
		System.out.println("안전장치 가동");
	}
}
