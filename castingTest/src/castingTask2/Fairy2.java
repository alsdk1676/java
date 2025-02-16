package castingTask2;

public class Fairy2 extends Monster2{
	
	public Fairy2() {;}
	
	
	public Fairy2(String name, String job, int level) {
		super(name, job, level);
	}


	@Override
	void get() {
//		super.get();
		System.out.println("날개를 얻었습니다🪽");
	}
	
	

}
