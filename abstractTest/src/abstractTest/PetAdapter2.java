package abstractTest;

public abstract class PetAdapter2 implements Pet { // 추상클래스를 가져와야되기 때문에
//	PetAdapter는 추상클래스이면서 adpter 역할을 한다
	
//	(poop()만 강제성 없애면 되는 상황)
//	강제성 없앰
	@Override
	public void poop() {;}
	
//	@Override
//	public void sitDown() {;}
//	
//	@Override
//	public void waitNow() {;}

}
