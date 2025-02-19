package threadTest;

public class Thread2 implements Runnable{
	
	@Override
	public void run() { // thread는 run에서 작동됨!
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()); // 지금 작업하는 쓰레드의 이름 출력
			try {
				Thread.sleep(1000); // sleep : 속도가 너무 빠를때 사용 ..
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
