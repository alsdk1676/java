package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread1 thread1 = new Thread1("!");
//		Thread1 thread2 = new Thread1("@");
		
//		thread1.run();
//		thread2.run();
		
		
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();
		
		Thread thread1 = new Thread(target1, "#"); // currentThread
		Thread thread2 = new Thread(target2, "@");
		
		thread1.start(); // run에 있는 자원들을 start라는 메서드로 실행시켜야지 단일 쓰레드를 스케쥴링 나눠줄 수 있음!
		thread2.start();
		
		
		
		
		
	}

}
