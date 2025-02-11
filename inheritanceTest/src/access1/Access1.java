package access1;

public class Access1 {
//	접근 제어자
	int data1; // default (같은 패키지 내에서 접근 가능)
	public int data2; // public : 공공 , 패키지가 달라도 누구나 접근 가능 , 모든 필드에서 사용해야 되는 값들
	protected int data3; // 다른 패키지에서는 접근 불가능, 단, 상속받은 자식은 다른 패키지에 있더라도 접근할 수 있음, 다른 서비스가 다른 필드값을 잘못가져갈수없도록
	private int data4;
	// 접근 불가, 값에 직접 접근하지 말고 메서드를 통해 접근해라!, 진짜로 값을 접근하면 안돼, 화면에서 가져다 쓸 값이야 => 메서드 제공
	//	private 키워드 보이면 => 메서드 만들기 => getter, setter 만들어라
	//	이유1) 값에 직접 접근하지 말라고 이유2) getter, setter 만들라고
	
	public Access1() {;}
	
//	getter : 값을 가져옴
	public int getData4() {
		return data4; // class.data4 XXXX
	}
	
//	setter : 값을 직접 때려넣지 않고 메서드를 통해 접근해라
	public void setData4(int data4) {
		this.data4 = data4;
	}

}
