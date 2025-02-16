package castingTask2;

public class Human2 extends Monster2{
	
	public Human2() {;}

	public Human2(String name, String job, int level) {
		super(name, job, level);
	}
	
	@Override
	void get() {
//		super.get();
		System.out.println("갑옷을 얻는다.");
	}
	
	
	
	

}
