package synchronizedTest;

public class ATM implements Runnable { // 비동기
	
	int money = 10000;
	
	public ATM() {;}
	
//	방법2 public + synchronized
	public synchronized void withdraw(int money) {
//		방법1
//		synchronized(객체) {}
//		synchronized(this) {
//			this.money -= money;
//		}
		this.money -= money; // 동시에 자원에 접근하고 있는 곳 => 동시화 시켜줌
		
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
		System.out.println("현재 잔액 : " + this.money + "원");
	}
	
//	Thread.interrupted(); // interrupted를 만나면 thread 종료됨.
//	- 쓰레드가 멈춰있을때만 종료할 수 있다.
	
	
	@Override
	public void run() {
		while(!Thread.interrupted()) {
			System.out.println("쓰레드 작업중");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++) {
			withdraw(1000);
		}
		
	}
	
	


}
