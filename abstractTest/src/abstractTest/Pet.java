package abstractTest;

public interface Pet {
	// 상수와 추상메서드가 필요하기 때문에 상수!
//	final int age = 10;
	final static String nation = "한국";
	
	public void sitDown();
	public void waitNow();
	public void poop();
}
