package threadTest;

public class Thread1 extends Thread { // 쓰레드를 상속받음으로써 쓰레드 일꾼 
	
	public String data;
	
	public Thread1() {;}
	
	public Thread1(String data) {
		this.data = data;
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(data);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
