package synchronizedTest;

public class CU {
	
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread ma = new Thread(atm, "민아");
		Thread dg = new Thread(atm, "동건");
		
		ma.start();
		dg.start();
	}

}
