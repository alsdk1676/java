package castingTask2;

public class Orc2 extends Monster2{
	
	public Orc2() {;}

	public Orc2(String name, String job, int level) {
		super(name, job, level);
	}
	
	@Override
	void get() {
//		super.get();
		System.out.println("가죽을 얻는다.");
	}
	
	
	
	

}
